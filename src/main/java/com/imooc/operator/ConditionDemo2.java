package com.imooc.operator;

/**
 * Created by Administrator on 2020/11/29.
 */
public class ConditionDemo2 {
    public static void main(String[] args) {
        //问题:升学考试，英语、数学、C语言三门总成绩大于等于230，并且英语成绩大于等于60，才能升学。
        //定义三个变量用来存放英语、数学、C语言的成绩数据
        double english=99,math=99,c=70;
        double sum = english+math+c;
        if(sum>=230&english>=60){
            System.out.println("恭喜你，可以升学！你的总成绩是："+sum+"分！你的英语成绩是："+english+"分！");
        }else{
            System.out.println("很遗憾，您不能升学！你的总成绩是："+sum+"分！你的英语成绩是："+english+"分!");
        }
    }
}
