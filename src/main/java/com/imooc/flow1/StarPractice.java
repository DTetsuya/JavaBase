package com.imooc.flow1;

/**
 * Created by daiqian on 2020-12-1615:11.
 * 用星号输出一个梯形
 */
public class StarPractice {

    public static void main(String[] args) {
        int n=5;
        //1、外重循环控制输出行数
        for (int i=1;i<=n;i++){
            //2、第一个内重循环控制输出的空格数，依次递减。
                for (int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
            //注意：由于星号和空格在屏幕上所占的空间不同，所以可以适当调整空格的输出，比如每次循环都输出两个空格。这样输出来的图形会更加接近梯形
            //3、第二个内重循环控制每行输出的星号数
            for (int k=1;k<=2*i+1;k++){
                System.out.print("*");
            }
            //4、输出完一行的星号和空格后换行
            System.out.println();
        }


    }
}
