package com.study.base.io;

import java.io.*;
import java.nio.charset.Charset;

/**
 * 转换流
 * OutputStreamWriter：可以将输出的字符流转换为字节流的输出形式
 * InputStreamRead：可以将输入的字节流转换为字符流的输入形式
 */
public class ChStreamDemo {

    private static void read(InputStream in) throws IOException {
        Reader reader = new InputStreamReader(in, Charset.forName("UTF-8"));
        char[] ch = new char[1024];
        int len = -1;
        while ((len = reader.read(ch)) !=-1){
            System.out.println(new String(ch,0,len));
        }
        reader.close();
    }

    private static void write(OutputStream out) throws IOException {
        Writer writer = new OutputStreamWriter(out,Charset.forName("UTF-8"));
        writer.write("我亚索贼溜");
        writer.close();
    }

    public static void main(String[] args) throws IOException {
//        InputStream in = new FileInputStream("D:\\tt\\my\\voice.txt");
//        read(in);

        OutputStream out = new FileOutputStream("D:\\tt\\my\\voice.txt");
        write(out);
    }
}
