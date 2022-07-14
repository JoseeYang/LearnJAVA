package com.bilibili.test;

import java.util.Random;

public class Test6 {
    public static void main(String[] args) {
        /* 抽红包：
         * 一个大V抽红包，奖品是现金红包，分别有2、588、888、1000、10000五个奖金
         * 用代码模拟抽奖，打印出每个奖项，获奖的出现顺序要求随机且不重复 */
        
        lottery();
    }
    
    
    //    抽奖函数
    public static void lottery() {
//        奖金池
        int[] allLotteryArr = {2, 588, 888, 1000, 10000};
//        被抽出的奖金记录数组
        int[] outLotteryArr = new int[5];

//        一共执行五次循环，每次循环能保证抽出一个未被抽出的数
        Random random = new Random();
        for (int i = 0; i < 5; ) {
            int randomIndex = random.nextInt(0, 5);
            int nowLottery = allLotteryArr[randomIndex];
//            如果抽出的数已经在被抽出记录数组中，则继续抽，若不在被抽出的记录数组中，则加入记录数组并且在加次数的情况下进行下一次循环
            if (!isArray(nowLottery, outLotteryArr)) {
                outLotteryArr[i] = nowLottery;
                i++;
                System.out.println(nowLottery + "的红包已被抽出！");
            }
        }
        
    }
    
    //        判断一个数是否存在于数组，输入一个数和一个数组，存在返回Ture，不存在返回False
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