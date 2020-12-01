package com.imooc.flow;

import java.util.Scanner;

/**
 * Created by Administrator on 2020/11/30.
 */
public class IntCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数x的值：");
        int x=sc.nextInt();
        System.out.println("请输入整数y的值：");
        int y=sc.nextInt();
        if(x!=y){
            if(x>y){
                System.out.println(x+">"+y);
            }else{
                System.out.println(x+"<"+y);
            }
        }else{
            System.out.println(x+"="+y);
        }
    }
}
