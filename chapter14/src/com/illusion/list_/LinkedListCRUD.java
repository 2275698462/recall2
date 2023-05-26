package com.illusion.list_;

import java.util.LinkedList;

public class LinkedListCRUD {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        linkedList.remove();//默认输出的是第一个结点

        linkedList.set(1, 999);//修改某个结点对象

        Object o =linkedList.get(1);//得到双向链表的第二个对象
        System.out.println(o);

        System.out.println("linkedList=" + linkedList);
    }
}
