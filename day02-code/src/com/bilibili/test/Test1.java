package com.bilibili.test;

import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        /* ������
         * һ����V��������Ʒ���ֽ������ֱ���2��588��888��1000��10000�������
         * �ô���ģ��齱����ӡ��ÿ������񽱵ĳ���˳��Ҫ������Ҳ��ظ�
         * ����Ǵ�������˳��ֱ�ӱ������ */
        
        lottery();
    }
    
//    �齱����
    public static void lottery(){
//        �����
        int[] allLotteryArr = {2, 588, 888, 1000, 10000};
//        ���ҽ����
        int[] newLotteryArr =upsetArr(allLotteryArr);
        
//        ����������Һ�Ľ����
        for (int i = 0; i < newLotteryArr.length; i++) {
            System.out.println(newLotteryArr[i] + "�ĺ���ѱ������");
        }
    }
    
    
//    �������麯��������һ�����飬���ش��Һ������
    public static int[] upsetArr(int[] Arr){
        
        Random random = new Random();
        for (int i = 0; i < Arr.length; i++) {
            int temp;
            int randomIndex = random.nextInt(Arr.length);
            temp = Arr[i];
            Arr[i] = Arr[randomIndex];
            Arr[randomIndex] = temp;
        }
        return Arr;
    }
}