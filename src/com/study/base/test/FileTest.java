package com.study.base.test;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws IOException {
        // 文件夹创建和文件创建正确写法
        String fileName = "logo.png";
        System.out.println("File.separator:" + File.separator);
        File testFile = new File("D:" + File.separator + "filepath" + File.separator + "test" + File.separator + fileName);
        File fileParent = testFile.getParentFile();//返回的是File类型,可以调用exsit()等方法
        String fileParentPath = testFile.getParent();//返回的是String类型
        System.out.println("fileParent:" + fileParent);
        System.out.println("fileParentPath:" + fileParentPath);
        if (!fileParent.exists()) {
            fileParent.mkdirs();// 能创建多级目录
        }
        if (!testFile.exists())
            testFile.createNewFile();//有路径才能创建文件
        System.out.println(testFile);

        String path = testFile.getPath();
        String absolutePath = testFile.getAbsolutePath();//得到文件/文件夹的绝对路径
        String getFileName = testFile.getName();//得到文件/文件夹的名字
        System.out.println("path:"+path);
        System.out.println("absolutePath:"+absolutePath);
        System.out.println("getFileName:"+getFileName);
    }

}
