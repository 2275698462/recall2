package com.illusion.date;

import java.util.Calendar;

public class Calendar_ {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        System.out.println("月 = " + (c.get(Calendar.MONTH) + 1));
        System.out.println("日 = " + c.get(Calendar.DAY_OF_MONTH));
        //Calendar没有提供对应的格式化类,需要由程序员自己来组合显示
    }
}
