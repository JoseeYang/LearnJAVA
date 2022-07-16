package com.bilibili.a01staticdemo2;

public class ArrayUtil {
    /* ���鹤���ࣺ
     * printArr�������������������
     * getAvg������ƽ���� */
    
    private ArrayUtil() {
    }
    
    //    ���������е�����
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
    
    //    ����ƽ����
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
