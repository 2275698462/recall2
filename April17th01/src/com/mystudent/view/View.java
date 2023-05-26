package com.mystudent.view;



import com.mystudent.myutility.Utility;
import com.mystudent.service.StudentService;
import com.mystudent.student.Student;
import javafx.scene.transform.Scale;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SuppressWarnings("all")
public class View {
    /**
     * 1、显示界面
     * 2、接收用户输入
     * 3、调用StudentService完成对学生信息的增删改查
     */
    Scanner scanner = new Scanner(System.in);
    String a, b, c, d;
    public void StudentView() {
        do {
            showLoginMenu();
            System.out.print("请选择,输入数字:");
            a = scanner.next();
            switch (a){
                case "1":
                    do {
                        showStudentMenu();
                        System.out.print("请选择,输入数字或输入0返回上一层:");
                        b = scanner.next();
                        switch (b) {
                            case "1":
                                seekStudent();
                                break;
                            case "2":
                                exit();
                                break;
                            case "0":
                                break;
                            default:
                                System.out.println("选择有误,请重新输入");
                        }
                    } while (!(b.equals("0")));
                    break ;
                case "2":
                    do {
                        showTeacherMenu();
                        System.out.print("请选择,输入数字或输入0返回上一层:");
                        c = scanner.next();
                        switch (c){
                            case "1":
                                addStudent();
                                break;
                            case "2":
                                delStudent();
                                break;
                            case "3":
                                updateStudent();
                                break;
                            case "4":
                                seekStudent();
                                break;
                            case "5":
                                listStudents();
                                break;
                            case "6":
                                exit();
                                break;
                            case "0":
                                break;
                            default:
                                System.out.println("选择有误,请重新输入");
                        }
                    } while (!(c.equals("0")));
                    break;
            }
        } while (!(a.equals("3")));
    }
    //6、退出程序
    private void exit(){
        System.out.print("你确认要退出吗(y / n):");
        String s = scanner.next();
        if (s.equals("y")){
            b = "0";
            c = "0";
            a = "3";
        }
    }
    //1、添加学生信息
    public static void addStudent(){
        int sid;//能被while外部访问到
        System.out.println("=================添加学生信息====================");
        System.out.print("姓名:");
        String name = Utility.readString(5);//姓名不超过5个字符
        while (true){
            System.out.print("学号:");
            sid = Utility.readInt();//长度小于6位
            if (StudentService.isSid(StudentService.list, sid)){
                System.out.println("学号重复,请重新输入");
            }
            else {
                break;
            }
        }
        System.out.print("性别:");
        String gender = Utility.readString(1);
        System.out.print("年龄:");
        int age = Utility.readInt();//长度小于6位
        System.out.print("住址:");
        String address = Utility.readString(20);
        //创建一个新的Sudent对象，id是系统自己分配的
        Student newStudent = new Student(0, sid, age, gender, name, address);
        StudentService.add(newStudent);
        System.out.println("=================添加学生信息成功====================");
    }
    //5、显示所有学生信息
    public void listStudents(){
        System.out.println("=================学生信息列表==================");
        if (StudentService.list.size() == 0) {
            System.out.println("无信息，请添加信息后重试");
        }
        else {
            System.out.println("编号\t\t姓名\t\t\t年龄\t\t性别\t\t学号\t\t\t住址");
            StudentService.list();
            System.out.println("=================学生信息列表显示完毕==================");
        }
    }
    //2、删除学生信息
    public static void delStudent(){
        System.out.println("=================删除学生信息==================\n");
        System.out.print("请输入你要删除学生的学号：");
        while (true) {
            int delSid = Utility.readInt();
            if (StudentService.del(delSid)) {
                System.out.println("=================删除学生信息成功==================");
                break;
            } else {
                System.out.println("该信息不存在，请重新输入,或者输入(-1)退出删除学生信息");
                delSid = Utility.readInt();
                if (delSid == -1) {
                    break;
                }else {
                    System.out.print("请重新输入:");
                }
            }
        }
    }
    //4、查找学生信息
    public static void seekStudent(){
        System.out.println("=================查找学生信息==================\n");
        System.out.print("请输入你要查找学生的学号：");
        while (true) {
            int seekSid = Utility.readInt();
            System.out.println("编号\t\t姓名\t\t\t年龄\t\t性别\t\t学号\t\t\t住址");
            if (StudentService.seek(seekSid)) {
                System.out.println("=================学生信息如上==================");
                break;
            } else {
                System.out.println("该信息不存在，请重新输入,或者输入(-1)退出查找学生信息");
                seekSid = Utility.readInt();
                if (seekSid == -1) {
                    break;
                } else {
                    System.out.println("请重新输入");
                }
            }
        }
    }
    //3、修改学生信息,定义在外部为了能让业务层访问到
    public static int updateSid;
    public static int updateage;
    public static String updategender;
    public static String updatename;
    public static String updateaddress;
    public static void updateStudent() {
        System.out.print("请输入要修改学生的学号:");
        updateSid = Utility.readInt();
        if (StudentService.existenceSid(updateSid)) {
            System.out.print("请输入要修改学生的姓名:");
            updatename = Utility.readString(5);
            System.out.print("请输入要修改学生的性别:");
            updategender = Utility.readString(1);
            System.out.print("请输入要修改学生的年龄:");
            updateage = Utility.readInt();
            System.out.print("请输入要修改学生的地址:");
            updateaddress = Utility.readString(20);
            if (StudentService.update(updateSid)) {
                System.out.println("=================修改学生信息成功==================");
            }
        } else {
            System.out.println("=================该学号不存在==================");
        }
    }
    private void showTeacherMenu(){
        System.out.println("\n==============教师端==============");
        System.out.println("\t\t1、添加学生信息");
        System.out.println("\t\t2、删除学生信息");
        System.out.println("\t\t3、修改学生信息");
        System.out.println("\t\t4、查找学生信息");
        System.out.println("\t\t5、显示所有学生信息");
        System.out.println("\t\t6、退出系统");
        System.out.println("\n******************************");
       }
       private void showStudentMenu(){
           System.out.println("\n==============学生端==============");
           System.out.println("\t\t1、查找学生信息");
           System.out.println("\t\t2、退出系统");
           System.out.println("\n******************************");
       }
       private void showLoginMenu(){
           System.out.println("\n\n============欢迎使用学生管理系统==============");
           System.out.println("\t\t1、学生端");
           System.out.println("\t\t2、教师端");
           System.out.println("\t\t3、退出系统");
           System.out.println("\n******************************");
       }
}
