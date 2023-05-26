package com.illusion.customgeneric;

public class CustomInterface {
}

//在继承接口,指定泛型接口的类型
interface IA extends IUsb<String, Double> {
}
//实现IA接口时，因为IA在继承IUsb接口时，指定了U为String, R 为 Double
class AA implements IA {

    @Override
    public Double get(String s) {
        return null;
    }

    @Override
    public void hi(Double aDouble) {

    }

    @Override
    public void run(Double r1, Double r2, String u1, String u2) {

    }
}

interface IUsb<U, R> {

    int n = 10;

    //U name; 静态成员不能使用泛型
    //普通方法中，可以使用接口泛型
    R get(U u);

    void hi(R r);

    void run(R r1, R r2, U u1, U u2);

    //在jdk8中，可以在接口中使用默认方法
    default R method(U u) {
        return null;
    }
}
