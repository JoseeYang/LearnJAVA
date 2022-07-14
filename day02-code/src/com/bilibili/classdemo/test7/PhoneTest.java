package com.bilibili.classdemo.test7;

import java.util.Scanner;

public class PhoneTest {
    public static void main(String[] args) {
        
        int avgPrice = 0;
        Phone[] phoneArr = new Phone[3];
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            Phone phone = new Phone();
            System.out.println("请输入第" + (i+1) + "个手机的品牌");
            phone.setBrand(scanner.next());
            System.out.println("请输入第" + (i+1) + "个手机的价格");
            phone.setPrice(scanner.nextInt());
            System.out.println("请输入第" + (i+1) + "个手机的颜色");
            phone.setColor(scanner.next());
            phoneArr[i] = phone;
        }
        for (int i = 0; i < phoneArr.length; i++) {
            avgPrice = avgPrice + phoneArr[i].getPrice();
        }
        avgPrice = avgPrice/phoneArr.length;
        System.out.println("平均价格为：" + avgPrice);
    }
}
