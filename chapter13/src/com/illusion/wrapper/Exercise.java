package com.illusion.wrapper;

public class Exercise {
    public static void main(String[] args) {
        Integer m = 1;
        Integer n = 1; //底层Integer.valueOf(1)
        System.out.println(m == n);//T
        //阅读源码(valueOf方法)，范围在-128 - 127就是直接返回，否则就new
        /**
         * public static Integer valueOf(int i) {
         *         if (i >= IntegerCache.low && i <= IntegerCache.high)
         *             return IntegerCache.cache[i + (-IntegerCache.low)];
         *         return new Integer(i);
         *     }
         */
        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);//F
    }
}
