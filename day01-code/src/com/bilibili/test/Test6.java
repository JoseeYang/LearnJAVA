package com.bilibili.test;

import java.util.Random;

public class Test6 {
    public static void main(String[] args) {
        /* ������
         * һ����V��������Ʒ���ֽ������ֱ���2��588��888��1000��10000�������
         * �ô���ģ��齱����ӡ��ÿ������񽱵ĳ���˳��Ҫ������Ҳ��ظ� */
        
        lottery();
    }
    
    
    //    �齱����
    public static void lottery() {
//        �����
        int[] allLotteryArr = {2, 588, 888, 1000, 10000};
//        ������Ľ����¼����
        int[] outLotteryArr = new int[5];

//        һ��ִ�����ѭ����ÿ��ѭ���ܱ�֤���һ��δ���������
        Random random = new Random();
        for (int i = 0; i < 5; ) {
            int randomIndex = random.nextInt(0, 5);
            int nowLottery = allLotteryArr[randomIndex];
//            �����������Ѿ��ڱ������¼�����У�������飬�����ڱ�����ļ�¼�����У�������¼���鲢���ڼӴ���������½�����һ��ѭ��
            if (!isArray(nowLottery, outLotteryArr)) {
                outLotteryArr[i] = nowLottery;
                i++;
                System.out.println(nowLottery + "�ĺ���ѱ������");
            }
        }
        
    }
    
    //        �ж�һ�����Ƿ���������飬����һ������һ�����飬���ڷ���Ture�������ڷ���False
    public static boolean isArray(int num, int[] arr) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}