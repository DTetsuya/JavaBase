package com.imooc.flow1;

/**
 * Created by Administrator on 2020/11/30.
 */
public class LoopDemo {
    public static void main(String[] args) {
        //使用while循环求1到5的平方和。
        int n=1;
        int sum=0;
        while (n<=5){
            sum+=n*n;
            n++;
        }
        System.out.println("1到5的平方和为："+sum);
    }
}
