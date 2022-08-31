package com.study.base.io;

import lombok.Data;

import java.io.Serializable;

@Data
public class Dog implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private Integer age;

    private String sex;

    private transient int id;// 在序列化中被忽略--transient

    public Dog(String name, Integer age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Dog() {
        super();
    }
}
