package com.imooc.flow1;

/**
 * Created by Administrator on 2020/11/30.
 */
public class PlusDemo {
    public static void main(String[] args) {
        //求1到100的累加和
        //1+2+3+4+5+...+100
        int n=1;
        int sum=0;
        while(n<=100){
            sum+=n;
            n++;
        }
        System.out.println("1到100的累加和为："+sum);
    }

}
