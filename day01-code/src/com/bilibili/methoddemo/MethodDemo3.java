package com.bilibili.methoddemo;

public class MethodDemo3 {
    public static void main(String[] args) {
//        ������ֵ�ķ������������
        int a = 10;
        int b = 20;
        int c = sum(a, b);
        System.out.println(c);
    }
    
    public static int sum(int a, int b) {
        return a + b;
    }
}