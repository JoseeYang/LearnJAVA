package com.bilibili.test;

public class Test1 {
    public static void main(String[] args) {
//        �÷����������飬Ҫ����һ����ʾ�����磺[11,22,33,44,55]
    
        int[] arr = {11, 22, 33, 44, 55};
        everyOne(arr);
    }
    
//    ����������һ����ʾ
    public static void everyOne(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}
