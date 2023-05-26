package com.illusion.set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@SuppressWarnings("all")
public class SetMethod {
    public static void main(String[] args) {
        Set set = new HashSet();
        //1、set接口的实现类的对象(Set接口对象),不能存放重复的元素，可以添加一个null
        //2、set接口对象存放数据是无序的(即添加的顺序和取出的顺序不一致)
        //3、注意:取出的顺序虽然不是添加的数据，但是他是固定的
        set.add("john");
        set.add("lucy");
        set.add("john");//重复
        set.add("jack");
        set.add("hsp");
        set.add(null);
        set.add(null);//再次添加null

        System.out.println("set=" + set);

        //遍历
        //方式1:使用迭代器
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println("obj=" + obj);
        }

        System.out.println("==========");

        //方式2:增强for
        for (Object o : set){
            System.out.println(o);
        }
        set.getClass();
        //set接口对象,不能通过索引来获取
    }
}
