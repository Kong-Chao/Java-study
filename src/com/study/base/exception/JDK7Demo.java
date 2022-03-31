package com.study.base.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JDK7Demo {
    public static void main(String[] args) throws IOException {
        //jdk1.5以后
        //Scanner scanner = new Scanner(System.in);
        //1.5之前接收控制台输入（直接使用io流）

        //1.7新特性，自动关闭流
        try( BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String info = br.readLine();
            int num = Integer.parseInt(info);
            System.out.println(info);
          //  br.close();
        }catch (IOException | NumberFormatException  e){
            e.printStackTrace();
        }
    }
}
