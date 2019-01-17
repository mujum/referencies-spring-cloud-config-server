package com.github.tubus.referenciesspringcloudconfigserver.controller;

import com.fasterxml.jackson.databind.JsonNode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
@ApiModel(description = "rest proxy controller")
public class RestController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/rest/test")
    @ApiModelProperty("test rest proxy")
    public ResponseEntity<JsonNode> useRestTemplate() {
        JsonNode results = restTemplate.getForObject(
            "http://10.101.20.85:7888/references/commerce/vehicle-categories", JsonNode.class);
        return new ResponseEntity<>(results, HttpStatus.OK);
    }
}
