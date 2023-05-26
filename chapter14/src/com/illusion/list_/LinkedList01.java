package com.illusion.list_;

public class LinkedList01 {
    public static void main(String[] args) {
        //模拟一个简单的双向链表
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node kkk = new Node("kkk");

        //连接三个结点,形成双向链表
        //jack -> tom -> kkk
        jack.next = tom;
        tom.next = kkk;
        //kkk -> tom -> jack
        kkk.prev = tom;
        tom.prev = jack;

        Node first = jack;//让first引用指向jack，就是双向链表的头节点
        Node last = kkk;//让last引用指向kkk，就是双向链表的尾节点

        //演示,从头到尾遍历
        while (true){
            if (first == null) {
                break;
            }
            System.out.println(first);
            first = first.next;
        }
        //演示从尾到头的遍历
        System.out.println("======================");
        while (true){
            if (last == null){
                break;
            }
            System.out.println(last);
            last = last.prev;
        }

        //演示链表的添加对象/数据
        //要求:是在tom ------- kkk 之间插入一个对象smith
        //1、先创建一个Node结点,name就是smith
        Node smith = new Node("smith");
        smith.next = kkk;
        smith.prev = tom;
        tom.next = smith;
        kkk.prev = smith;

        System.out.println("================");
        first = jack;//让first再次指向jack
        while (true){
            if (first == null) {
                break;
            }
            System.out.println(first);
            first = first.next;
        }
    }
}

//定义一个Node类，Node对象表示双向链表的一个结点
class Node{
    public Object item;//真正存放数据的地方
    public Node next;  //指向后一个结点
    public Node prev;   //指向前一个结点
    public Node(Object name){
        this.item = name;
    }

    @Override
    public String toString() {
        return "Node name=" + item;
    }
}
