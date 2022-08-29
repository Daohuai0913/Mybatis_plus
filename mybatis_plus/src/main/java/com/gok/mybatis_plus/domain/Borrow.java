package com.gok.mybatis_plus.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Borrow {
    private long id;
    private long userId;
    private long bookId;
    private long borrowNumber;
//    持续时间
    private LocalDateTime duration;
    private LocalDateTime createTime;
    private int states;
    private LocalDateTime returnTime;

    public Borrow(long userId, long bookId, long borrowNumber, LocalDateTime duration, LocalDateTime createTime, int states, LocalDateTime returnTime) {
        this.userId = userId;
        this.bookId = bookId;
        this.borrowNumber = borrowNumber;
        this.duration = duration;
        this.createTime = createTime;
        this.states = states;
        this.returnTime = returnTime;
    }
}
