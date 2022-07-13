package com.bilibili.test;

public class Test2 {
    public static void main(String[] args) {
//        定义一个方法复制数组，提供数组，开始的索引，结束的索引，返回新数组
        
        int[] oldArr = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        int form = 5;
        int to = 7;
        
        int[] newArr;
        newArr = copyArr(oldArr, form, to);
    
        outArr(newArr);
        
    }
    
    //    按要求复制数组
    public static int[] copyArr(int[] oldArr, int form, int to) {
        int[] newArr = new int[to - form + 1];
        for (int i = form, j = 0; i <= to; i++, j++) {
            newArr[j] = oldArr[i];
        }
        return newArr;
    }
    
    //    遍历在一行输出数组
    public static void outArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
