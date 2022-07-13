package com.bilibili.arraydemo;

public class ArrayDemo1 {
    public static void main(String[] args) {
        /* 数组的初始化分为静态初始化和动态初始化
        * 数组的静态初始化：
        * 完整格式：数据类型 [] 数组名 = new 数据类型 {数据本体}
        * 简写格式：数据类型 [] 数组名 = {数据本体}
        *
        * 数组的动态初始化：
        * 数据类型 [] 数组名 = new 数据类型 {数组长度} */
        
        /* 当两个数组指向同一内存空间的时候，他们就是一个数组有两个名字而已，修改其中一个的值，另一个也会随之改变 */
    
        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1;
        System.out.println(arr1[0]);
        System.out.println(arr2[0]);
        
        arr2[0] = 5;
        System.out.println(arr1[0]);
        System.out.println(arr2[0]);
    }
}
