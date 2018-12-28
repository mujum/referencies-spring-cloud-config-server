package com.github.tubus.referenciesspringcloudconfigserver.controller;

import com.github.tubus.referenciesspringcloudconfigserver.dto.info.UserInfoDTO;
import com.github.tubus.referenciesspringcloudconfigserver.service.InfoServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.constraints.NotNull;
import java.util.List;

@Controller
@Api(description = "Info Controller")
public class InfoController {

    private InfoServiceImpl infoService;

    @Autowired
    public InfoController(InfoServiceImpl infoService) {
        this.infoService = infoService;
    }

    @PostMapping("/info/create/user")
    @ApiOperation("creating of the new user")
    public ResponseEntity<String> createUserInfo(
        @RequestBody @NotNull UserInfoDTO userInfoDTO
    ) {
        String response = "Пользователь заведен";
        try {
            infoService.createUserInfo(userInfoDTO);
        } catch (Exception exception) {
            response = "Пользователь не заведен\nПричина отказа:\n" + exception.getMessage();
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/info/users")
    @ApiOperation("Show all users")
    public ResponseEntity<List<UserInfoDTO>> getUsers() {
        List<UserInfoDTO> users = infoService.getAllUsersInfo();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
}

/*
curl -X POST -H "Content-Type: application/json" -d '{ "id" : "1", "name" : "firstBorn"}' http://localhost:3156/info/create/user; echo

 */
