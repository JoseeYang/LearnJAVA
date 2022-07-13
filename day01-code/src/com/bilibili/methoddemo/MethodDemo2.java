package com.bilibili.methoddemo;

public class MethodDemo2 {
    public static void main(String[] args) {
//        带参数的方法的定义与调用
        sum(15, 1);
    }
    
    public static void sum(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }
}
