package com.bilibili.test;

import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        /* 抽红包：
         * 一个大V抽红包，奖品是现金红包，分别有2、588、888、1000、10000五个奖金
         * 用代码模拟抽奖，打印出每个奖项，获奖的出现顺序要求随机且不重复
         * 这次是打乱数组顺序，直接遍历输出 */
        
        lottery();
    }
    
//    抽奖函数
    public static void lottery(){
//        奖金池
        int[] allLotteryArr = {2, 588, 888, 1000, 10000};
//        打乱奖金池
        int[] newLotteryArr =upsetArr(allLotteryArr);
        
//        遍历输出打乱后的奖金池
        for (int i = 0; i < newLotteryArr.length; i++) {
            System.out.println(newLotteryArr[i] + "的红包已被抽出！");
        }
    }
    
    
//    打乱数组函数，输入一个数组，返回打乱后的数组
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