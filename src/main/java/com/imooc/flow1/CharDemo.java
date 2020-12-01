package com.imooc.flow1;

/**
 * Created by Administrator on 2020/11/30.
 */
public class CharDemo {
    public static void main(String[] args) {
        //循环输出26个英文小写字母
        char ch = 'a';
        int count=1;
        while (ch<='z'){
            System.out.println(ch+" ");
            if(count%13==0){
                System.out.println();
            }
            count++;
            ch++;
        }
    }
}
