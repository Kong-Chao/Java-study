package com.study.base.io;

import java.io.*;

public class DateStreamDemo {

    private static void read() throws IOException {
        File file = new File("D:\\tt\\my\\voice.dat");
        if ( !file.exists()){
            file.createNewFile();
        }
        InputStream in = new FileInputStream(file);
        // 缓冲
        BufferedInputStream bis = new BufferedInputStream(in);
        DataInputStream dis = new DataInputStream(bis);
        int num = dis.readInt();
        byte b = dis.readByte();
        String s = dis.readUTF();
        System.out.println(num +"," +b + "," + s) ;

        dis.close();

    }

    private static void write() throws IOException {
        File file = new File("D:\\tt\\my\\voice.dat");
        if ( !file.exists()){
            file.createNewFile();
        }
        OutputStream out = new FileOutputStream(file);
        // 缓冲
        BufferedOutputStream bos = new BufferedOutputStream(out);
        DataOutputStream dos = new DataOutputStream(bos);

        dos.writeInt(10); // 写入四个字节
        dos.writeByte(1); // 写入一个字节
        dos.writeUTF("中国");

        dos.close();

    }

    public static void main(String[] args) throws IOException {
     //   write();
        read();
    }
}
