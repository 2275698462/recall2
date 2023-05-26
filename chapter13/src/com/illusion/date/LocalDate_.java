package com.illusion.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDate_ {
    public static void main(String[] args) {
        LocalDateTime ldf = LocalDateTime.now();
        System.out.println(ldf);
        System.out.println("年=" + ldf.getYear());
        //使用DateTimeFormatter 对象来进行格式化
        DateTimeFormatter d = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH小时mm分钟ss秒");
        String format = d.format(ldf);
        System.out.println("格式化的日期 = " + format);

        //提供plus和minus方法可以把当前时间进行加或者减
        //890后是什么时候
        LocalDateTime localDateTime = ldf.plusDays(890);
        System.out.println("890后是   " + d.format(localDateTime));

        //3456分钟前是什么时候
        LocalDateTime localDateTime1 = ldf.minusMinutes(3456);
        System.out.println("3456分钟前是  " + d.format(localDateTime1));
    }
}
