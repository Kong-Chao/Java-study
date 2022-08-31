package com.study.base.io;

import java.io.*;

/**
 * 字节打印流: 在字节打印输出时，可以增强输出能力
 *
 * 字符打印流：
 *
 */
public class PrintStreamDemo {

    private static void charPrint() throws IOException {
        File file = new File("D:\\tt\\my\\voice.txt");
        Writer out = new FileWriter(file);
        // 缓存
        BufferedWriter bos = new BufferedWriter(out);
        // 增强打印功能
        PrintWriter pw = new PrintWriter(bos);
        pw.println("JKDJDBJ嗨嗨嗨");
        pw.close();
    }

    private static void bytePrint() throws FileNotFoundException {
        File file = new File("D:\\tt\\my\\voice.txt");
        OutputStream out = new FileOutputStream(file);
        // 缓存
        BufferedOutputStream bos = new BufferedOutputStream(out);
        PrintStream ps = new PrintStream(bos);
        ps.println("天天下雨");
        ps.close();
    }

    public static void main(String[] args) throws IOException {
       // bytePrint();
        charPrint();
    }

}
