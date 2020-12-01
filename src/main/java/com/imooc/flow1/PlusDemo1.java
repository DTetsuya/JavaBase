package com.imooc.flow1;

/**
 * Created by Administrator on 2020/11/30.
 */
public class PlusDemo1 {
    public static void main(String[] args) {
        //求1+3+5+7+...15的和
        int n=1;
        int sum=0;
        while(n<=15){
            sum+=n;
            n+=2;
        }
        System.out.println("1+3+5+7+...15的和为："+sum);
    }

}
