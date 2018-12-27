package com.github.tubus.referenciesspringcloudconfigserver.dto.info;

import java.time.LocalDateTime;

public class UserInfoDTO {

    public UserInfoDTO() {
    }

    /**
     * id пользователя
     */
    private long id;

    /**
     *  имя пользователя
     */
    private String name;

    /**
     * Сотовый оператор пользователя
     */
    private long phone;

    /**
     * Компания или группа пользователя
     */
    private int company;

    /**
     * Номер телефона пользователя
     */
    private String number;

    /**
     * Когда был заведён пользователь
     */
    private LocalDateTime time;

    /**
     * Описание пользователя
     */
    private String description;

    /**
     * Полезная информация о пользователе
     */
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