package com.illusion.list_;

import java.util.Vector;

public class Vector_ {
    public static void main(String[] args) {
        Vector vector = new Vector();//debug看源码
        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }
        vector.add(20);
    }
}
