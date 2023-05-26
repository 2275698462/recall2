package com.illusion.homework01;

public class Homework01 {
    /**
     * 接受命令行的两个参数(整数)，计算两数相除，使用方法cal
     * 对数据格式不正确(NumberFormatException)，缺少命令行参数(ArrayIndexOutOfBoundsException)，
     * 除0(ArithmeticException)进行异常处理
     */
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("参数个数不对");
            }

            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);

            double res = cal(n1, n2);

            System.out.println(res);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("参数格式不对");
        } catch (ArithmeticException e) {
            System.out.println("出现了除0的异常");
        }
    }

    public static double cal(int n1, int n2) {
        return n1 / n2;
    }
}
