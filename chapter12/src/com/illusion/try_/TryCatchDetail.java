package com.illusion.try_;

public class TryCatchDetail {
    public static void main(String[] args) {

        try {
            String s1 = "123";
            int a = Integer.parseInt(s1);
            System.out.println(a);
        } catch (NumberFormatException e) {
            System.out.println("异常信息=" + e.getLocalizedMessage());
        }
    }
}
