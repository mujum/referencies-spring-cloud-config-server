package com.github.tubus.referenciesspringcloudconfigserver.controller;

import com.github.tubus.referenciesspringcloudconfigserver.dto.info.UserInfoDTO;
import com.github.tubus.referenciesspringcloudconfigserver.service.InfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.constraints.NotNull;

@Controller
public class InfoController {

    private InfoServiceImpl infoService;

    @Autowired
    public InfoController(InfoServiceImpl infoService) {
        this.infoService = infoService;
    }

    @PostMapping("/info/create/user")
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
}

/*
curl -X POST -H "Content-Type: application/json" -d '{ "id" : "1", "name" : "firstBorn"}' http://localhost:3156/info/create/user; echo

 */
