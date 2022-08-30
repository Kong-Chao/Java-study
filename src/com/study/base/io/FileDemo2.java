package com.study.base.io;

import java.io.File;

public class FileDemo2 {

    public static void main(String[] args) {
        findFile(new File("D:\\tt\\my"),".zip");
    }

    // 查找指定目录下的文件
    private static void findFile(File target,String ext){
        if (target == null) return;
        // 如果文件是目录
        if (target.isDirectory()){
            File[] files = target.listFiles();
            if (files != null){
                for (File f : files) {
                    findFile(f,ext);
                }
            }
        }else {
             // 此处表示file为一个文件
            String name = target.getName().toLowerCase();
           // System.out.println(name);
            if (name.endsWith(ext)){
                System.out.println(target.getAbsolutePath());
            }
        }
    }
}
