package com.gok.mybatis_plus.domain;

import lombok.Data;

@Data
public class Book {
    private Long bookId;
    private String bookName;
    private String bookAuthor;
    private int number;

    public Book(String bookName, String bookAuthor, int number) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.number = number;
    }
}
