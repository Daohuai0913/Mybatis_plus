package com.gok.mybatis_plus.domain;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import lombok.Data;

@Data
public class Admin {
    private long adminId;
    private String adminName;
    private String adminPassword;

    public Admin(String adminName, String adminPassword) {
        this.adminName = adminName;
        this.adminPassword = adminPassword;
    }
}
