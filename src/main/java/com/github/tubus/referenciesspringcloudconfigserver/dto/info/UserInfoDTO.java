package com.github.tubus.referenciesspringcloudconfigserver.dto.info;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDateTime;

@ApiModel(description = "Информация о пользователе")
public class UserInfoDTO {

    public UserInfoDTO() {
    }

    @ApiModelProperty("id пользователя")
    private long id;

    @ApiModelProperty("имя пользователя")
    private String name;

    @ApiModelProperty("Сотовый оператор пользователя")
    private long phone;

    @ApiModelProperty("Компания или группа пользователя")
    private int company;

    @ApiModelProperty("Номер телефона пользователя")
    private String number;

    @ApiModelProperty("Когда был заведён пользователь")
    private LocalDateTime time;

    @ApiModelProperty("Описание пользователя")
    private String description;

    @ApiModelProperty("Полезная информация о пользователе")
    private String payload;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public int getCompany() {
        return company;
    }

    public void setCompany(int company) {
        this.company = company;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }
}