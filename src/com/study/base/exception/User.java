package com.study.base.exception;

import lombok.Data;

@Data
public class User {
    private String userName;
    private String passWord;
    private Integer age;
    private String sex;

    public User() {
        super();
    }

    public User(String userName, String passWord, Integer age, String sex) {
        this.userName = userName;
        this.passWord = passWord;
        this.age = age;
        this.sex = sex;
    }
}
