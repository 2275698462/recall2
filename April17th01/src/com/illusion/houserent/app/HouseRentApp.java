package com.illusion.houserent.app;

import com.illusion.houserent.view.HouseView;

public class HouseRentApp {
    public static void main(String[] args) {
        //创建HouseView对象，并显示主菜单，是整个程序的入口
        new HouseView().mainMenu();
        System.out.println("\n--你退出房屋出租系统--");
    }
}

