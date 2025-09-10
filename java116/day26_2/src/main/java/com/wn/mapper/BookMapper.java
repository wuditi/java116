package com.wn.mapper;

import org.springframework.transaction.jta.UserTransactionAdapter;

public class BookMapper {

    private String name;
    private int count;

    public int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
