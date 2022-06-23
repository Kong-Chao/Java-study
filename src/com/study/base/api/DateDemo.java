package com.study.base.api;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();

        Calendar c1 = Calendar.getInstance();
        Calendar c2 = new GregorianCalendar();

        int year = c1.get(Calendar.YEAR);
        int month = c1.get(Calendar.MONTH);
        int day = c1.get(Calendar.DAY_OF_MONTH);
        int hour = c1.get(Calendar.HOUR_OF_DAY);
        int minute = c1.get(Calendar.MINUTE);
        int second = c1.get(Calendar.SECOND);
        int millisecond = c1.get(Calendar.MILLISECOND);

        StringBuffer sb = new StringBuffer();
        sb.append(year).append("年").append(month).append("月").append(day).append("日").append(hour).append(":")
                .append(minute).append(":").append(second).append(" ").append(millisecond);
        System.out.println(sb);

        DateFormat df = new SimpleDateFormat("yyy-MM-dd hh:mm:ss sss");
        String nowDateTime = df.format(new Date());
        System.out.println(nowDateTime);
    }
}
