package com.imooc.operator;

/**
 * Created by Administrator on 2020/11/29.
 */
public class conditionDemo {
    public static void main(String[] args) {
        //例：商场打折，如果两件商品的价格>100则减20，并把原价和折后价格分别输出。
        //定义两个变量，分别存放两件商品的价格
        double price1,price2;
        price1=80;
        price2=55;
        //计算两件商品的总价格
        double sum=price1+price2;
        //输出原价格
        System.out.println("两件商品的原价格为："+sum);
        if(sum>100){
            sum-=20;//sum=sum-20;
        }
        System.out.println("两件商品打折后的价格为："+sum);
    }
}
