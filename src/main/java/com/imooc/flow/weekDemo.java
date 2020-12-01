package com.imooc.flow;

import java.util.Scanner;

/**
 * Created by Administrator on 2020/11/30.
 */
public class weekDemo {
    public static void main(String[] args) {
        /*
        从键盘输入1-7之间的任意数字，分别输出对应的信息。
        1----星期一
        2----星期二
        3---星期三
        4---星期四
        5---星期五
        6---星期六
        7---星期日
         */
        System.out.println("请输入1-7之间的数字：");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        switch (n){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
            System.out.println("输入的数字有误，请重新输入！");
        }
    }
}
