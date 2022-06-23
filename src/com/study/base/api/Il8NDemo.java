package com.study.base.api;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * 程序国际化
 * 1.Local
 * 2.properties文件：属性文件，参数以key-value键值对形式存放
 *  ResourceBundle类表示的是一个资源文件的读取操作，所有的资源文件需要使用 ResourceBundle进行读取，读取的时候不需要加上下文的后缀
 *  方法： getString(String key)
 *  getBundles(String BaseName,Local local)
 *  getBundle(String BaseName)
 *  3.MessageFormat.format 动态文本处理
 */
public class Il8NDemo {


    public static void main(String[] args) {
        //创建一个地语言环境对象，这个对象会根据参数设置来自动选择与之相关的语言环境
        //参数：语言、地区
        Locale locale_CN = new Locale("zh","CN");
        Locale locale_US = new Locale("en","US");
        //获取当前系统的参数
        Locale locale_default = Locale.getDefault();
        System.out.println(locale_default);

        Scanner scanner = new Scanner(System.in);

        // 用于绑定属性文件的工具类（参数：属性文件的基本名，就是前缀，比如info）
        ResourceBundle r = ResourceBundle.getBundle("com.study.base.api.info",locale_CN);
        System.out.println(r.getString("system.name"));
        System.out.println(r.getString("input.username"));
        String username = scanner.nextLine();
        System.out.println(r.getString("input.password"));
        String password = scanner.nextLine();
        if ("admin".equals(username) && "123".equals(password)){
            System.out.println(r.getString("login.success"));
            String welcome = r.getString("welcome");
            welcome = MessageFormat.format(welcome,username);
            System.out.println(welcome);
        }else {
            System.out.println(r.getString("login.error"));
        }
    }
}
