package com.illusion.collection_;

import java.util.ArrayList;
import java.util.List;

public class CollectionMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        //添加单个元素
        list.add("jack");
        list.add(100); //list.add(new Integer(100));
        list.add(true);
        System.out.println("list=" + list);
    }
}
