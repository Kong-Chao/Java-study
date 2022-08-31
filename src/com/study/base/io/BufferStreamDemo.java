package com.study.base.io;

import java.io.*;

/**
 * 字节缓冲流: 解决在写入文件操作时候，频繁的操作文件所带来的性能降低问题
 * BufferedOutputStream 内部默认的缓存大小8KB,每次写入时存储到缓存中的byte数组中，当数组存满时，会把数组中的数据写入文件并且缓存下表归零
 *
 * 字符缓冲流
 * 1.加入字符缓冲流，增强读取功能（read Line）
 * 2. 更高效的读取数据，
 * FileReader：内部使用 Input StreamReader，解码过程 byte ->char ,默认缓存大小8kb
 * BufferedReader： 默认缓存大小 8 k, 但是可以手动指定缓存大小，把数据进阶读取到缓存中，减少每次转换过程，提高效率
 */
public class BufferStreamDemo {
    private static void charWriter() throws IOException {
        File file = new File("D:\\tt\\my\\voice.txt");
        Writer writer = new FileWriter(file);

        // 为字符读取速度提供缓存，提高读取效率
        BufferedWriter bw = new BufferedWriter(writer);
        bw.write("张大嘴巴");
        bw.flush();
        bw.close();
    }


    private static void charReader() throws IOException {
        File file = new File("D:\\tt\\my\\voice.txt");
        Reader reader = new FileReader(file);

        // 为字符读取速度提供缓存，提高读取效率
        BufferedReader br = new BufferedReader(reader);
        char[] cs = new char[1024];
        int len = -1;
        while ((len = br.read(cs)) != -1){
            System.out.println(new String(cs,0,len));
        }
        br.close();
    }

    private static void byteWriter() throws IOException {
        File file = new File("D:\\tt\\my\\voice.txt");
        OutputStream out = new FileOutputStream(file);

        //构建一个字节缓冲流
        BufferedOutputStream bos = new BufferedOutputStream(out);

        String info = "亚索6-10";
        out.write(info.getBytes());

        bos.close();
       //out.close();
    }

    private static void byteRead() throws IOException {
        File file = new File("D:\\tt\\my\\voice.txt");
        InputStream in = new FileInputStream(file);

        //构建一个字节缓冲流
        BufferedInputStream bos = new BufferedInputStream(in);

        byte[] bytes = new byte[1024];
        int len = -1;
        while ((len = bos.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));
        }

        bos.close();
        //out.close();
    }

    public static void main(String[] args) throws IOException {
      //  byteWriter();
      //  byteRead();
       // charWriter();
        charReader();
    }
}
