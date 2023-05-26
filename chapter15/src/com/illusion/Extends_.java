package com.illusion;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"all"})
public class Extends_ {
    public static void main(String[] args) {
        List<Object> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<AA> list3 = new ArrayList<>();
        List<BB> list4 = new ArrayList<>();
        List<CC> list5 = new ArrayList<>();

        //list1 = list2; 编译不通过

        list3.add(new CC());


        p1(list1);
        p1(list2);
        p1(list3);
        p1(list4);
        p1(list5);

        p2(list3);
        p2(list4);
        p2(list5);

        p3(list3);
        p3(list1);

    }
    public static void p1(List<?> c){ }
    public static void p2(List<? extends AA> c){}
    public static void p3(List<? super AA> c){}

    public void test(){
        List<? extends AA> list1 = null;
        List<? super AA> list2 = null;
        List<?> list3 = null; //add不进去东西,因为 <?> 代表 (-∞,+∞)

        //list1.add(new AA()); 编译不通过,<? extends AA> 代表(-∞,AA] ,考虑每一个都有可能,只能父类指向子类
        //list1.add(new BB());


        list2.add(new AA());// <? super AA>代表[AA,+∞) ,考虑每一种情况都有可能,因为最小的是AA,所以都可以
        list2.add(new BB());
        list2.add(new CC());

    }
}
class AA{}
class BB extends AA{}
class CC extends BB{}