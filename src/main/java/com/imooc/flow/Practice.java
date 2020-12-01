package com.imooc.flow;

/**
 * Created by Administrator on 2020/11/30.
 */
public class Practice {
    /*
    1、定义整型变量x并初始化为-5
    2、定义整型变量y并初始化0
    3、根据所给条件，使用多重if-else结构求y的值
    4、输出x和y的值
     */
    public static void main(String[] args) {
        int x=-5,y=0;
        if(x<0){
            y=-1;
        }else if(x==0){
            y=0;
        }else{
            y=1;
        }
        System.out.println("x="+x+",y="+y);
    }

}
