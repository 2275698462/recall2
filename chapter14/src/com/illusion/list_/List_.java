package com.illusion.list_;

import java.util.ArrayList;
import java.util.List;

public class List_ {
    public static void main(String[] args) {
        List list = new ArrayList();
        //1、List集合类中元素有序，即添加顺序和取出顺序一致，且可重复
        list.add("jack");
        list.add("tom");
        list.add("mary");
        list.add("tom");
        System.out.println("list= " + list);
        //2、List集合支持索引，从0开始
        System.out.println(list.get(0));
    }
}
