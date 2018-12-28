package com.github.tubus.referenciesspringcloudconfigserver.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Response")
public class InfoResponse {

    @ApiModelProperty("Описание")
    String description;

    public InfoResponse() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
