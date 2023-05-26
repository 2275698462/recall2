package com.illusion.String;

public class Exercise10 {
    String str = new String("hsp");
    final char[] ch = {'j', 'a', 'v', 'a'};
    public void change(String str, char ch[]) {
        str = "java";
        ch[0] = 'h';
    }
    public static void main(String[] args) {
        Exercise10 exercise10 = new Exercise10();
        exercise10.change(exercise10.str, exercise10.ch);
        System.out.println(exercise10.str);
        System.out.println(exercise10.ch);//hsp，而不是它的地址，看println源码
    }
}
