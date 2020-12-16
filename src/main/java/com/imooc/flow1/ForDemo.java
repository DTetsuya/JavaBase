package com.imooc.flow1;

/**
 * Created by daiqian on 2020-12-1613:20.
 *局部变量只在定义它的大括号内有效
 */
public class ForDemo {
    public static void main(String[] args) {
        int sum=0;
        for(int n=1;n<=5;n++){
            sum=sum+n;
        }
        System.out.println("sum="+sum);
    }
}
