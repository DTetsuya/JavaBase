package com.imooc.operator;

/**
 * Created by Administrator on 2020/11/29.
 */
public class MathPratice {
    public static void main(String[] args) {
        //定义整型变量m并初始化为10
        int m = 10;
        //定义整型变量n并初始化为5
        int n = 5;
        //将变量m的值加3，n的值加5
        m+=3;
        n+=5;
        //求m和n的平均值，并将结果存为变量p中
        double p = (m+n)/2;
        //将m的平方乘以n的平方，并将结果存为变量q中
        double q = (m*m)*(n*n);
        //将p和q的值打印输出
        System.out.println("p="+p);
        System.out.println("q="+q);
    }
}
