package com.bilibili.a01staticdemo2;

public class ArrayUtil {
    /* 数组工具类：
     * printArr，返回整数数组的内容
     * getAvg，返回平均分 */
    
    private ArrayUtil() {
    }
    
    //    返回数组中的内容
    public static String printArr(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                sb.append(arr[i]).append(", ");
            } else {
                sb.append(arr[i]);
            }
        }
        sb.append("]");
        return sb.toString();
    }
    
    //    返回平均分
    public static int getAvg(int[] arr) {
        int sum = 0;
        int avg;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        avg = sum / arr.length;
        return avg;
    }
}
