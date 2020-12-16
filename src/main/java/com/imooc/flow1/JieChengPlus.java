package com.imooc.flow1;

/**
 * Created by daiqian on 2020-12-1614:33.
 * 求1-25的阶乘的累加和
 */
public class JieChengPlus {
    public static void main(String[] args) {
        long s=1,sum=0;
        //外重循环控制累加和
        for (int i=1;i<=25;i++){
            //内重循环控制阶乘
            s=1;
            for (int j=1;j<=i;j++){
                s=s*j;//s存放阶乘计算的结果
            }
            sum=sum+s;
        }
        System.out.println("1!+2!+3!+4!+...+25!="+sum);
    }
}
