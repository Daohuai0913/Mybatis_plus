package com.gok.mybatis_plus.domain;

import lombok.Data;

@Data
public class Tag {
    private long id;
    private String tagName;

    public Tag(String tagName) {
        this.tagName = tagName;
    }
}
