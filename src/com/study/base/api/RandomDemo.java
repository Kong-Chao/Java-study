package com.study.base.api;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random r =new Random();
        System.out.println(r.nextDouble());
        System.out.println(r.nextInt(10));
    }

}
