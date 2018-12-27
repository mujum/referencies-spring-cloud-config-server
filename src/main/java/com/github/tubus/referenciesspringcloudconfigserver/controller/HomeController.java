package com.github.tubus.referenciesspringcloudconfigserver.controller;

import com.github.tubus.referenciesspringcloudconfigserver.service.interfaces.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.github.tubus.referenciesspringcloudconfigserver.dto.InfoResponse;

@Controller
public class HomeController {

    private InfoService infoService;

    @Autowired
    public HomeController(InfoService infoService) {
        this.infoService = infoService;
    }

    @GetMapping("/")
    public ResponseEntity<String> home() {
        return new ResponseEntity<>("Welcome to config server", HttpStatus.OK);
    }

    @GetMapping("/info")
    public ResponseEntity<InfoResponse> info() {
        InfoResponse response = infoService.getInfo();
        return new ResponseEntity(response, HttpStatus.OK);
    }
}
