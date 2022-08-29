package com.gok.mybatis_plus.domain;

import lombok.Data;

@Data
public class admin {
    private long adminId;
    private String adminName;
    private String adminPassword;

    public admin(String adminName, String adminPassword) {
        this.adminName = adminName;
        this.adminPassword = adminPassword;
    }
}
