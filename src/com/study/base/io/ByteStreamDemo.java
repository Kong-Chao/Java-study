package com.study.base.io;

import java.io.*;

/**
 * 字节输入流输出流
 * 输出流：超类：OutputStream
 * 输入流：超类：InputStream
 *字节操作流，默认每次写入操作会直接写入文件，
 * 输入输出字节操作原理：每次只操作一个字节，
 * 一般操作非文本文件时你，使用字节流，操作文本文件使用，建议使用字符流
 */
public class ByteStreamDemo {

    private static void out(){
        File file = new File("D:\\tt\\my\\test.txt");
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        //构建一个文件输出对象

        try {
            OutputStream out = new FileOutputStream(file ,true); // true 可以增加内容
            // 输出内容
            String s = "今早很饿qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq\r\n";
            System.getProperty("line.separator");
            out.write(s.getBytes());
            // 关闭流
            out.close();
            System.out.println("success");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void in(){
        File file = new File("D:\\tt\\my\\test.txt");
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        //构建一个文件输出对象

        try {
            InputStream in = new FileInputStream(file);
            byte[] bytes = new byte[1024];
            StringBuilder buf  = new StringBuilder();
            int len = -1; // 每次读取字节的长度
            // 把数据读取到数组中，并返回读取的字节数，！= -1，读取数据中， =-1表示已经读取完
            while ((len = in.read(bytes))!= -1){
                // 根据读取到的字节数组，转换为字符串内容，
                buf.append(new String(bytes));
            }
            System.out.println(buf);
            in.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    public static void main(String[] args) {
        out();
        in();
    }
}
