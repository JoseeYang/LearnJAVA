package com.bilibili.test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        /* 卖飞机票：
         * 机票价格按照淡季旺季、头等舱经济舱收费、输入机票原价、月份和头等舱或经济舱
         * 按照以下规则计算机票价格：旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7折，经济舱6.5折 */
        
        double oldPrice;
        int month;
        int place;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("请输入机票原价：");
        oldPrice = scanner.nextInt();
        System.out.println("请输入当前月份：");
        month = scanner.nextInt();
        System.out.println("请输入乘坐的舱位(1表示头等舱，2表示经济舱)：");
        place = scanner.nextInt();
    
        double newPrice = calPrice(oldPrice, month, place);
        System.out.println("您需要付的钱为：" + newPrice);
    }
    
    public static double calPrice(double oldPrice, int month, int place) {
        double newPrice;
        if (month >= 5 && month <= 10) {
            if (place == 1) {
                newPrice = oldPrice * 0.9;
            } else {
                newPrice = oldPrice * 0.85;
            }
        } else {
            if (place == 1) {
                newPrice = oldPrice * 0.7;
            } else {
                newPrice = oldPrice * 0.65;
            }
        }
        return newPrice;
    }
}
