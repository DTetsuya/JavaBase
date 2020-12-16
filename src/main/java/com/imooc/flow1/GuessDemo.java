package com.imooc.flow1;

import java.util.Scanner;

/**
 * Created by daiqian on 2020-12-1612:51.
 * 猜字游戏
 * 要求猜一个介于1到10之间的数字，然后将猜测的值与实际值进行比较，并给出提示，以便能更接近实际值，直到猜中为止
 */
public class GuessDemo {
    public static void main(String[] args) {
        //设置答案
        int number=6;
        int guess;
        System.out.println("猜一个介于1到10直接的数字:");
        do{
            System.out.println("请输入您猜测的数字:");
            Scanner sc = new Scanner(System.in);
            guess=sc.nextInt();
            if (guess>number){
                System.out.println("猜大了！");
            }else if (guess<number){
                System.out.println("猜小了！");
            }
        }while(number!=guess);
        System.out.println("恭喜您猜中了！答案为："+number);
    }
}
