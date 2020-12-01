package com.imooc.flow;

/**
 * Created by Administrator on 2020/11/30.
 */
public class CharDemo {
    /*
    1、定义一个字符变量ch并初始化
    2、使用switch结构判断是否为元音字母，如果是元音字母则输出如效果图所示的内容，如果不是元音字母则输出：不是元音字母
    提示：元音字母为a、e、i、o、u
     */
    public static void main(String[] args) {
        char a= 'a';
        switch(a){
            case 'a':
                System.out.println("元音字母 a");
                break;
            case 'e':
                System.out.println("元音字母 e");
                break;
            case 'i':
                System.out.println("元音字母 i");
                break;
            case 'o':
                System.out.println("元音字母 o");
                break;
            case 'u':
                System.out.println("元音字母 u");
                break;
            default:
                System.out.println("不是元音字母!");
        }
    }

}
