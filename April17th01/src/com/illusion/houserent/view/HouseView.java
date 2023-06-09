package com.illusion.houserent.view;

import com.illusion.houserent.domain.House;
import com.illusion.houserent.service.HouseService;
import com.illusion.houserent.utils.Utility;

/**
 * 1、显示界面
 * 2、接受用户的输入
 * 3、调用HouseService完成对房屋的各种操作
 */
public class HouseView {

    private boolean loop = true;
    private char key = ' ';//接收用户选择
    private HouseService houseService = new HouseService(5);//设置数组的大小为2

    //修改房屋
    public void update() {
        System.out.println("=============修改房屋信息===============");
        System.out.println("请选择待修改房屋编号(-1表示退出)");
        int updateId = Utility.readInt();
        if (updateId == -1) {
            System.out.println("=============放弃修改房屋信息===============");
            return;
        }
        House house = houseService.findById(updateId);
        if (house == null) {
            System.out.println("=============修改房屋信息不存在===============");
            return;
        }
        System.out.print("姓名(" + house.getName() + "):");
        String name = Utility.readString(8, "");
        if (!"".equals(name)) {
            house.setName(name);
        }

        System.out.println("电话(" + house.getPhone() + "):");
        String phone = Utility.readString(12, "");
        if (!"".equals(phone)) {
            house.setPhone(phone);
        }

        System.out.println("地址(" + house.getAddress() + "):");
        String address = Utility.readString(12, "");
        if (!"".equals(address)) {
            house.setAddress(address);
        }

        System.out.println("租金(" + house.getRent() + "):");
        int rent = Utility.readInt(-1);
        if (rent != -1) {
            house.setRent(rent);
        }

        System.out.println("状态(" + house.getState() + "):");
        String state = Utility.readString(3, "");
        if (!"".equals(state)) {
            house.setState(state);
        }

    }

    //查找房屋
    public void findHouse() {
        System.out.println("=============查找房屋信息===============");
        System.out.print("请输入你要查找的房屋id:");
        int findId = Utility.readInt();
        //调用方法
        House house = houseService.findById(findId);
        if (house != null) {
            System.out.println(house);
        } else {
            System.out.println("=============查找房屋信息id不存在===============");
        }
    }

    //完成退出确认
    public void exit() {
        //这里使用Utility提供方法，完成确认
        char c = Utility.readConfirmSelection();
        if (c == 'Y') {
            loop = false;
        }
    }

    //编写delHouse()，接收输入的id，调用Service的del方法
    public void delHouse() {
        System.out.println("=============删除房屋信息===============");
        System.out.print("请输入待删除房屋的编号(-1退出)");
        int delId = Utility.readInt();
        if (delId == -1) {
            System.out.println("=============放弃删除房屋信息===============");
            return;
        }
        //注意该方法本身就有循环判断的逻辑，必须输入Y/N
        char choice = Utility.readConfirmSelection();
        if (choice == 'Y') {
            if (houseService.del(delId)) {
                System.out.println("=============删除房屋信息成功===============");
            } else {
                System.out.println("=============删除房屋信息失败===============");
            }
        } else {
            System.out.println("=============放弃删除房屋信息===============");
        }
    }

    //编写addHouse()接收输入，创建House对象，调用add方法
    public void addHouse() {
        System.out.println("=============添加房屋===============");
        System.out.print("姓名:");
        String name = Utility.readString(8);
        System.out.print("电话:");
        String phone = Utility.readString(12);
        System.out.print("地址:");
        String address = Utility.readString(5);
        System.out.print("月租:");
        int rent = Utility.readInt();
        System.out.print("状态(未出租/已出租)：");
        String state = Utility.readString(3);
        //创建一个新的House对象，注意id是系统分配的
        House newHouse = new House(0, name, phone, address, rent, state);
        if (houseService.add(newHouse)) {
            System.out.println("=============添加房屋成功===============");
        } else {
            System.out.println("=============添加房屋失败===============");
        }
    }

    //编写listHouse()房屋列表
    public void listHouse() {
        System.out.println("=============房屋列表===============");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        House[] houses = houseService.list(); //得到所有房屋信息，此houses非彼houses
        for (int i = 0; i < houses.length; i++) {
            if (!(houses[i] == null)) {
                System.out.println(houses[i]);
            }
        }
        System.out.println("=============房屋列表显示完毕===============");
    }

    //显示主菜单
    public void mainMenu() {
        do {
            System.out.println("\n=============房屋出租系统===============");
            System.out.println("\t\t1、新 增 房 源");
            System.out.println("\t\t2、查 找 房 屋");
            System.out.println("\t\t3、删 除 房 屋");
            System.out.println("\t\t4、修 改 房 屋 信 息");
            System.out.println("\t\t5、房 屋 列 表");
            System.out.println("\t\t6、退      出");
            System.out.print("请输入你的选择:");
            key = Utility.readChar();
            switch (key) {
                case '1':
                    addHouse();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    System.out.print("修 改 房 屋 信 息");
                    break;
                case '5':
                    listHouse();
                    break;
                case '6':
                    exit();
                    break;
                default:
                    System.out.print("你的选择有误，请重新选择");
            }
        } while (loop);
    }
}
