package com.illusion.StringBuffer;

/**
 * replace(int start,int end, String str):把[start,end)位置替换为str
 * insert(int offset, xxx):在指定位置插入xxx,原本offset位置后移
 * reverse():逆转
 *
 *
 * 总结：
 * 增：append
 * 删：delete
 * 改：setCharAt  /  replace
 * 查：charAt(int n)
 * 插：insert
 * 长度：length();
 * 遍历：toString()    /   for() + charAt
 */
public class Method {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("abc");
        s1.append(1);
        s1.append('1');//字符串拼接
        System.out.println(s1); //abc11
        s1.delete(2,4);//左闭右开
        System.out.println(s1); //ab1


    }
}
