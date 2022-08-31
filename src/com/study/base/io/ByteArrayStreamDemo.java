package com.study.base.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * 字节数组流是基于内存操作，内部含有一个字节数组，可以利用流的读取机制来处理字符串
 */
public class ByteArrayStreamDemo {

    private static void byteArray(){

        String s ="&*&*&KJJJDHJDHDKDHKJSH";
        ByteArrayInputStream bat = new ByteArrayInputStream(s.getBytes());
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int len = -1; //每次读取的节数
        while ((len = bat.read()) != -1){
            if ((len>=65 && len <= 90) || (len >=97 && len <= 122)){
                baos.write(len);
            }
        }

        //此时无需关闭，原因：字节数组流是基于内存的操作流
        System.out.println(baos.toString());
    }

    public static void main(String[] args) {
        byteArray();
    }
}
