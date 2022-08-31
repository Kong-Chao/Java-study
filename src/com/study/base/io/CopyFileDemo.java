package com.study.base.io;

import java.io.*;

/**
 * 文件复制：一边读一边写
 */
public class CopyFileDemo {

    public static void main(String[] args) throws IOException {
        copy("D:\\88.jpg","D:\\tt\\my\\88.jpg");
    }

    private static void copy(String src,String target) throws IOException {
        File srcFile = new File(src);
        File targetFile = new File(target);

        InputStream in = new FileInputStream(srcFile);
        OutputStream out  = new FileOutputStream(targetFile);
        int len = -1;
        byte[] bytes = new byte[1024];
        while ((len = in.read(bytes)) != -1){
            out.write(bytes,0,len);
        }
        if (in !=null) in.close();
        if (out !=null) out.close();
    }
}
