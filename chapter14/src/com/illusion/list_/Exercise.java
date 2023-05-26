package com.illusion.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exercise {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("a");
        list.add(1, "hsp");
        list.get(5);
        list.remove(6);
        list.set(7, "sad");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }
}