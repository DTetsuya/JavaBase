package com.imooc.operator;

/**
 * Created by Administrator on 2020/11/29.
 */
public class MathDemoPractice {
    public static void main(String[] args) {
        int n = 789;
        System.out.println(n/10%2);
        System.out.println((n-n%10)/100);
        System.out.println(n%10);
        System.out.println(n%100/10);
    }
}
