package com.imooc.base;

/**
 * Created by Administrator on 2020/11/29.
 */
public class CharDemo {
    public static void main(String[] args) {
        //定义一个变量存放字符a
        char a = 'a';
        System.out.println("a="+a);
        char ch = 65535;
        //如果字面值超出char类型所表示的数据类型，需要进行强制类型转换。
        char ch1 = (char)65536;
        System.out.println("ch="+ch);
        System.out.println("ch1="+ch1);
        //定义变量存放unicode编码表示的字符
        char c = '\u005d';
        System.out.println("c="+c);
    }
}
