package com.bilibili.test;

import java.util.Random;

public class Test5 {
    public static void main(String[] args) {
        /* 开发验证码：
         * 定义方法产生一个随机五位验证码
         * 验证码格式：
         *   长度为5
         *   前四位为大写或小写字母
         *   最后一位是数字 */
        
        String str = randomCode();
        System.out.println(str);
    }
    
    public static String randomCode() {
        String str = "";
        
//        创建一个数组，里面存放大写字母和小写字母
        char[] alphabet = new char[52];
        
//        存放小写字母
        for (int i = 0, j = 97, g = 0; i < 26; i++, g++) {
            alphabet[i] = (char) (j + g);
        }
//        存放大写字母
        for (int i = 26, j = 65, g = 0; i < 52; i++, g++) {
            alphabet[i] = (char) (j + g);
        }
        
//        创建一个数组，里面存放数字0-9
        int[] digitalTable = new int[10];
        for (int i = 0; i < 10; i++) {
            digitalTable[i] = i ;
        }
    
//        定义一个随机源，在大小写数组中随机抽三次，在数字数组中随机抽一次
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            str = str + alphabet[random.nextInt(0,52)];
        }
        str = str + digitalTable[random.nextInt(0,10)];
        
        return str;
    }
}
