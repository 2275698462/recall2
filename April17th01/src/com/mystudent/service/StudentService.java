package com.mystudent.service;


import com.mystudent.student.Student;
import com.mystudent.view.View;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("all")
public class StudentService {
    /**
     *     响应界面的调用
     *     创建集合类list存放student类
     *     完成对学生信息的crud
     */
    public static List<Student> list = new ArrayList<>();
    private static int idCount;
    //add方法，添加新对象
    public static void add(Student st){
        list.add(st);
        //完成id自增长
        st.setId(idCount++);
    }
    //list方法，输出Student
    public static void list(){
        //遍历list集合类
        for (Object obj : list){
            System.out.println(obj);
        }
    }
    //为了使学号唯一，定义一个方法判断学号是否被使用
    public static boolean isSid(List list, int sid){
        //如果与集合中某个学生的学号相同，返回true
        for (int i = 0; i < list.size(); i++) {
            Object o = list.get(i);//向上转型
            Student s = (Student)o;
            if (s.getSid() == sid) {
                return true;
            }
        }
        return false;
    }
    //del方法，用来删除集合的某个对象
    public static boolean del(int delSid) {
        //判断学号是否存在，遍历集合
        for (int i = 0; i < list.size(); i++) {
            Object o = list.get(i);
            Student s = (Student)o;
            if (delSid == s.getSid()) {
                list.remove(i);
                return true;
            }
        }
        return false;
    }
    //seek方法查找集合的某个学生信息
    public static boolean seek(int seekSid){
        //判断学号是否存在
        for (int i = 0; i < list.size(); i++) {
            Object o = list.get(i);
            Student s = (Student)o;
            if (seekSid == s.getSid()) {
                System.out.println(s);
                return true;
            }
        }
        return false;
    }
    //update方法修改学生信息
    public static boolean update(int updateSid){
        //判断学号是否存在
        for (int i = 0; i < list.size(); i++) {
            Object o = list.get(i);
            Student s = (Student)o;
            if (s.getSid() == updateSid) {
                //创建一个学生对象
                Student updateStudent = new Student(s.getId(), View.updateSid, View.updateage,
                        View.updategender, View.updatename, View.updateaddress);//原本id编号,学号不变
                list.set(i, updateStudent);
                return true;
            }
        }
        return false;
    }
    //existenceSid方法判断学号是否存在
    public static boolean existenceSid(int eSid) {
        for (int i = 0; i < list.size(); i++) {
            Object o = list.get(i);
            Student s = (Student)o;
            if (eSid == s.getSid()){
                return true;
            }
        }
        return false;
    }
}
