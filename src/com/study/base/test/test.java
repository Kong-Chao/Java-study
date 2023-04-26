package com.study.base.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author kc
 * @create 2023-02-06 16:03
 */
public class test {
    public static void main(String[] args) {
        String str = "1111";
        String pattern = "\\w[-\\w.+]*@([A-Za-z0-9][-A-Za-z0-9]+\\.)+[A-Za-z]{2,14}";

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(str);
        System.out.println(m.matches());

    }

}
