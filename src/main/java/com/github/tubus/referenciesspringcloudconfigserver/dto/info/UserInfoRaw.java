package com.github.tubus.referenciesspringcloudconfigserver.dto.info;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDateTime;

public class UserInfoRaw {

    public UserInfoRaw() {
    }

    @ApiModelProperty("id пользователя")
    private long id;

    @ApiModelProperty("имя пользователя")
    private String name;

    @ApiModelProperty("Сотовый оператор пользователя")
    private long phone;

    @ApiModelProperty("Компания или группа пользователя")
    private int company_id;

    @ApiModelProperty("Номер телефона пользователя")
    private String phone_number;

    @ApiModelProperty("Когда был заведён пользователь")
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime timestamp_;

    @ApiModelProperty("Описание пользователя")
    private String description;

    @ApiModelProperty("Полезная информация о пользователе")
    private String payload;

    public UserInfoDTO createDTO() {

        UserInfoDTO result = new UserInfoDTO();
        result.setId            (this.id);
        result.setName          (this.name);
        result.setPhone         (this.phone);
        result.setCompany       (this.company_id);
        result.setNumber        (this.phone_number);
        result.setTime          (this.timestamp_);
        result.setDescription   (this.description);
        result.setPayload       (this.payload);

        return result;
    }

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

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public LocalDateTime getTimestamp_() {
        return timestamp_;
    }

    public void setTimestamp_(LocalDateTime timestamp_) {
        this.timestamp_ = timestamp_;
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
