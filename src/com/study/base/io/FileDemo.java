package com.study.base.io;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * file 操作类
 */
public class FileDemo {
    public static void main(String[] args) {
        // File类表示一个文件或目录
        //File file = new File("D:\\test.txt");
        // 跨平台使用 File.separator
        File file = new File("D:" + File.separator +"tt" +File.separator + "voice.txt");
        if ( !file.exists()){
            try {
                file.createNewFile();
                System.out.println("创建文件成功");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println( file.isFile());
        System.out.println(file.isDirectory());

        // 列出当前目录下所有文件名称
        File file2 = new File("D:\\tt");
        if (!file2.exists()){
            file2.mkdirs();
        }
        String[] s= file2.list();
        System.out.println(s);

        File[] files = file2.listFiles(); //列出当前目录下所有文件以file对象返回
        for (File f1 : files) {
            System.out.println("length=" + f1.length());
            System.out.println("name=" + f1.getName());
            System.out.println("相对路劲" + f1.getPath());
            System.out.println("绝对路劲" + f1.getAbsolutePath());
            System.out.println("是否隐藏文件" + f1.isHidden());
            System.out.println("是否可读" +  f1.canRead());
            System.out.println("------------");
        }

        File f5 = new File("D:\\tt\\my\\a.text");
        File f6 = f5.getParentFile();
        if (!f6.exists()){
            f6.mkdirs();
        }
        if (!f5.exists()){
            try {
                f5.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        file.renameTo(new File("D:\\tt\\my\\voice.txt"));
    }
}
