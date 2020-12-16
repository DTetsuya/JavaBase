package com.imooc.flow1;

/**
 * Created by daiqian on 2020-12-1612:39.
 */
public class StarDemo {
    public static void main(String[] args) {
        int m=1;//控制外重循环的循环变量
        int n=1;//控制内重循环的循环遍历
        System.out.println("输出10行10列的星号");
        //外重循环控制输出几行
        while(m<=10){
            //内重循环控制每行输出几个星号
            n=1;
            while(n<=10){
                System.out.print("*");
                n++;
            }
            System.out.println();
            m++;
        }
    }
}
