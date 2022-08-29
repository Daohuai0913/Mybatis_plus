package com.gok.mybatis_plus.domain;

import lombok.*;

/**
 * @author huai
 * @date 2022/8/22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private long userId;
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
