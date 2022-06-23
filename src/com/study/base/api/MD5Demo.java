package com.study.base.api;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;

/**
 * 信息摘要算法
 * 步骤：1.确定计算方法
 * 2.jdk1.8新增Base64
 */
public class MD5Demo {
    private static String savePassword ="AZICOnu9cyUFFvBp3xi1AA==";

    public static void main(String[] args) throws NoSuchAlgorithmException, IOException {
        String password = "";
       // login(password);
        String str = encodeMd5(password);
        System.out.println(str);
        byte[] bytes = Base64.getDecoder().decode(str);
        String a = String.valueOf(bytes);
        System.out.println(a);

    }

    public static boolean login(String password) throws NoSuchAlgorithmException {
        if (savePassword.equals(encodeMd5(password))){
            return true;
        }else {
            return false;
        }
    }

    public static String encodeMd5(String password) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("md5");
        //通过md5计算摘要
        byte[] bytes = md.digest(password.getBytes(StandardCharsets.UTF_8));
        String str = Base64.getEncoder().encodeToString(bytes);
        return str;
    }


    public static void test(String password) {
        //String password ="admin123";
        String savePassword ="AZICOnu9cyUFFvBp3xi1AA==";

        try {
            MessageDigest md = MessageDigest.getInstance("md5");
            //通过md5计算摘要
            byte[] bytes = md.digest(password.getBytes(StandardCharsets.UTF_8));
            System.out.println(Arrays.toString(bytes));
            String mdStr = new String(bytes);
           // System.out.println(mdStr);
            //a-z A-Z 0-9 /* Base64编码算法 1.8版本
            String str = Base64.getEncoder().encodeToString(bytes);
            System.out.println(str);

            //jdk q.8之前用的,现在不建议使用
            BASE64Encoder base64 = new BASE64Encoder();
            String str1 = base64.encode(bytes);
            System.out.println(str1);
            //解码
            BASE64Decoder decoder = new BASE64Decoder();
            byte[] bs = decoder.decodeBuffer(savePassword);
            System.out.println(bs);
        } catch (NoSuchAlgorithmException | IOException e) {
            e.printStackTrace();
        }
    }
}
