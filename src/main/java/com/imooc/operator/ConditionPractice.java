package com.imooc.operator;

/**
 * Created by Administrator on 2020/11/29.
 */
public class ConditionPractice {
    public static void main(String[] args) {
        //定义整型变量x和y，并进行赋值
        int x=-2,y=0;
        //如果x>0，则y=2*x+1，否则y=x+5
        if(x>0){
            y=2*x+1;
        }else {
            y=x+5;
        }
        //输出x和y的值
        System.out.println("x="+x);
        System.out.println("y="+y);
    }
}
