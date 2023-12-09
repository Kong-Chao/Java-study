package com.study.base.test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author kc
 * @create 2023-02-06 16:03
 */
public class test {
    public static String generateCronExpression(String dateString) {
        // 将String转换为LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.parse(dateString, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        // 使用DateTimeFormatter来格式化日期和时间
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ss mm HH dd MM ?");
        String formattedDate = localDateTime.format(formatter);

        // 获取年月日时分秒的具体值
        String[] values = formattedDate.split(" ");

        // 构建Cron表达式，注意月份需要加1，因为LocalDateTime中的月份是从1开始计数的
        String cronExpression = String.format("%s %s %s %s %s ?", values[0], values[1], values[2], values[3], values[4], values[5]);

        return cronExpression;
    }

    public static void main(String[] args) {
        // 生成当前日期的Cron表达式
        String currentDate = "2023-12-31 23:59:59";
        String cronExpression = generateCronExpression(currentDate);

        // 打印生成的Cron表达式
        System.out.println("Cron Expression: " + cronExpression);
    }
}
