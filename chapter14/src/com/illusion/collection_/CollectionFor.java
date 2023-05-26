package com.illusion.collection_;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionFor {
    public static void main(String[] args) {
        Collection col = new ArrayList();

        col.add(new Book("aaa", "a", 10));
        col.add(new Book("bbb", "b", 20));
        col.add(new Book("ccc", "c", 30));

        //使用增强for,底层仍是迭代器
        //可以理解就是简化版本的迭代器遍历
        //快捷键方式I
        for (Object book : col) {
            System.out.println("book=" + book);
        }
    }
}
