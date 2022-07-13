package com.bilibili.test;

public class Test4 {
    public static void main(String[] args) {
        /* 找质数：
        * 判断101-200之间有多少个质数，并输出所有的质数 */
        
        int sum = 0;
        for (int i = 101; i < 201; i++) {
            boolean flag = true;
            
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            
            if (flag) {
                sum++;
                System.out.print(i + " ");
            }
        }
        System.out.println("共有" + sum + "个质数");
    }
}
