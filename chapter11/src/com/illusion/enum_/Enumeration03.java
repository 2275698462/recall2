package com.illusion.enum_;

public class Enumeration03{
    public static void main(String[] args) {
        //使用Season2枚举类来演示各种方法
        Season2 autumn = Season2.AUTUMN;
        System.out.println(autumn.name()); //AUTUMN
        //AUTUMN枚举对象是第三个，因此输出2
        System.out.println(autumn.ordinal()); //ordinal()输出的是该枚举对象的次序/编号，从0开始
        //从反编译可以看出values方法，返回Season2[]
        //含有定义的所有枚举对象
        Season2[] values = Season2.values();
        for(Season2 season: values) { //增强for循环
            System.out.println(season);
        }
//        int[] nums = {1, 2, 3};
//        for(int aa: nums) {
//            System.out.println(aa);
//        }
        //valueOf:将字符串转换成枚举对象，要求字符串必须为已有的常量，否则报异常
        /**
         * 执行流程
         * 1、根据输入的“AUTUMN”到Season2的枚举对象去查找
         * 2、如果找到了就返回，如果没有找到就报错
         */
        Season2 autumn1 = Season2.valueOf("AUTUMN");
        System.out.println("autumn1= " + autumn1);
        System.out.println(autumn == autumn1); //true

        //compareTo:比较两个枚举常量，比较的就是编号
        System.out.println(Season2.AUTUMN.compareTo(Season2.SUMMER));
        //Season2.AUTUMN编号[2] - Season2.SUMMER编号[3] = -1
    }
}
//演示enum关键字来实现枚举类
enum Season2 {

//    public static final Season SPRING = new Season("春天", "温暖");
//    public static final Season SUMMER = new Season("夏天", "炎热");
//    public static final Season AUTUMN = new Season("秋天", "凉爽");
//    public static final Season WINTER = new Season("冬天", "寒冷");

    /**
     * 如何使用enum来实现枚举类
     * 1、使用关键字enum替代class
     * 2、public static final Scanner SPRING = new Season("春天"， "温暖") 直接使用
     *    SPRING("春天"， "温暖")   常量名(实参列表)
     * 3、如果有多个常量(对象)， 使用,间隔即可
     * 4、如果使用enum来实现枚举，要求将定义常量对象写在前面
     */
    SPRING("春天","温暖"), Winter("冬天", "寒冷"),
    AUTUMN("秋天", "凉爽"), SUMMER("夏天",  "炎热");
    private String name;
    private String desc; //描述
    private Season2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season2{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
