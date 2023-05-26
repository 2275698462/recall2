package com.illusion.customgeneric;

public class CustomGeneric_ {
    public static void main(String[] args) {

    }
}
class Tiger<T, R, M>{
    String name;
    R r;
    M m;
    T t;
    T[] ts;//因为数组在new时不能确定T的类型,就无法在内存开空间
}
