package com.study.base.api;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Base64Tester {
    public static void main(String args[]) {

        try {
            String base64encodedString = "AZICOnu9cyUFFvBp3xi1AA==";
            //String base64encodedString = "SmF2YSA4IEJhc2U2NCDnvJbnoIHop6PnoIEgLSBKYXZhOOaWsOeJueaApyAtIOeugOWNleaVmeeoiyA=";

            byte[] base64decodedBytes = Base64.getDecoder().decode(base64encodedString);

            System.out.println(new String(base64decodedBytes, "utf-8"));

        } catch(UnsupportedEncodingException e) {
            System.out.println("异常：" + e.getMessage());
        }
    }
}
