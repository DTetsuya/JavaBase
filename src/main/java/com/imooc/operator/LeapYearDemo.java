package com.imooc.operator;

import java.util.Scanner;

/**
 * Created by Administrator on 2020/11/30.
 */
public class LeapYearDemo {
    public static void main(String[] args) {
        System.out.println("请输入年份：");
        Scanner sc = new Scanner(System.in);
        int year=sc.nextInt();
        if(((year%4==0)&(year%100!=0))|(year%400==0)){
            System.out.println(year+"年是闰年！");
        }else{
            System.out.println(year+"年不是闰年！");
        }
    }
}
