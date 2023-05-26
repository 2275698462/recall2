package com.illusion.houserent.service;

import com.illusion.houserent.domain.House;

/**
 * 1、定义House[]，保存到House对象
 * 2、响应HouseView的调用
 * 3、完成对房屋信息的增删改查
 */
public class HouseService {

    private House[] houses; //保存House对象
    private int houseNums = 1;//记录当前有多少个房屋信息
    private int idCounter = 1;//记录当前的id增长到哪个值

    public HouseService(int size) {
        //new houses
        houses = new House[size];
        //为了配合测试，这里初始化一个House对象
        houses[0] = new House(1, "jack", "112", "广州", 3000, "未出租");
    }

    //findById方法，返回House对象或者null
    public House findById(int findId){
        //遍历数组
        for (int i = 0; i < houseNums; i++) {
            if (findId == houses[i].getId()){
                return houses[i];
            }
        }
        return null;
    }
    //del方法，删除一个房屋信息
    public boolean del(int delId){

        //应当先找到要删除的房屋信息对应的下标
        //注意：下表和房屋编号不是一回事
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            if (delId == houses[i].getId()) { //要删除房屋的id ，是数组下标为i的元素
                index = i; //使用index记录i , i是真正要删除的元素
            }
        }
        if(index == -1){ //说明delId在数组中不存在
            return false;
        }
        for (int i = index; i < houseNums - 1; i++) {
            houses[i] = houses[i + 1];
        }
        houses[--houseNums] = null;
        return true;
    }

    //add方法，添加新对象，返回boolean
    public boolean add(House newHouse){
        //判断是否还可以继续添加(暂时不考虑数组扩容的问题)
        if(houseNums == houses.length) {
            System.out.println("数组已满，不能再添加了...");
            return false;
        }
        //把newHouse对象加入到，新增加一个房屋
        houses[houseNums++] = newHouse;
        //需要设计一个id自增长的机制,更新到newHouse的id
        newHouse.setId(++idCounter);
        return true;
    }
    //list方法，返回houses
    public House[] list(){
        return houses;
    }
}
