package com.imooc.flow1;

/**
 * Created by daiqian on 2020-12-1613:45.
 *
 * 求出200到300之间的整数，且满足条件：它们三个数字之积为42，三个数字之和为12
 */
public class LoopPractice{
    public static void main(String[] args) {
        int ge,shi,bai=0;
        //循环遍历200到300之间的整数
        for(int n=200;n<=300;n++){
            //分别取出个位、十位和百位上的数字
            bai=n/100%10;
            shi=n/10%10;
            ge=n/1%10;
            //求三个数字的和与积
            int product=bai*shi*ge;
            int sum=bai+shi+ge;
            //判断三个数字的积是否为42，三个数字的和是否为12，如果满足条件则输出该数
            if (product==42&sum==12){
                System.out.println(n);
            }
        }





    }
}
