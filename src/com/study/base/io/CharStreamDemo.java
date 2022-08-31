package com.study.base.io;

import java.io.*;

/**
 * 字符流
 * 字符输出流： Write ,对文件的操作使用子类FileWrite
 * 字符输入流：Read，对文件的操作使用子类FileRead
 *  每次操作的单位是一个字符,文件操作字符会自带缓存，默认大小1024字节，在缓存满后，或手动刷新缓存，或关闭流
 */
public class CharStreamDemo {
    private  static void  out() throws IOException {
        File file = new File("D:\\tt\\my\\voice.txt");
        Writer out = new FileWriter(file);
        out.write("小飞棍来咯");
        out.close();
    }

    private  static void  in() throws IOException {
        File file = new File("D:\\tt\\my\\voice.txt");
        Reader in = new FileReader(file);
        // 数组处理
        char[] ch = new char[1];
        int len = -1;
        StringBuilder buf = new StringBuilder();
        while ((len = in.read(ch)) != -1){
            buf.append(new String(ch,0,len));
        }
        System.out.println(buf);
        in.close();
    }


    public static void main(String[] args) throws IOException {
        out();
        in();
    }
}
