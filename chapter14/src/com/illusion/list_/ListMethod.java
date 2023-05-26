package com.illusion.list_;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("张三丰");
        list.add("贾宝玉");
        //在索引 = 1的位置插入一个对象
        list.add(1, "刘备");
        System.out.println("list=" + list);
        List list2 = new ArrayList();
        list2.add("jack");
        list2.add("tom");
        list.addAll(1, list2);
        System.out.println("list = " + list);
        System.out.println(list.indexOf("tom"));//返回在集合中首次出现的位置，没有—1
        System.out.println(list.lastIndexOf("刘备"));//返回在集合中末次出现的位置，没有—1
        list.remove(0); //移除指定index位置的元素，并返回此元素
        System.out.println("list = " + list);
        list.set(1, "玛丽"); //替换
        System.out.println("list = " + list);
        //sublist返回子集合，前闭后开
        List list3= list.subList(0, 2);
        System.out.println("list3 = "+ list3);
    }
}
