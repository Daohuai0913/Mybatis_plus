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
    private Long id;
    private String name;
    private String password;
    private Integer age;
    private String tel;


}
