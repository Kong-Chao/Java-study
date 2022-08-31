package com.study.base.io;

import java.io.*;

/**
 * 字节缓冲流: 解决在写入文件操作时候，频繁的操作文件所带来的性能降低问题
 * BufferedOutputStream 内部默认的缓存大小8KB,每次写入时存储到缓存中的byte数组中，当数组存满时，会把数组中的数据写入文件并且缓存下表归零
 */
public class BufferStreamDemo {
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
        byteRead();
    }
}
