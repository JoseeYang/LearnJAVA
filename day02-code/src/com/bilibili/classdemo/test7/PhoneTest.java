package com.bilibili.classdemo.test7;

import java.util.Scanner;

public class PhoneTest {
    public static void main(String[] args) {
        
        int avgPrice = 0;
        Phone[] phoneArr = new Phone[3];
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            Phone phone = new Phone();
            System.out.println("�������" + (i+1) + "���ֻ���Ʒ��");
            phone.setBrand(scanner.next());
            System.out.println("�������" + (i+1) + "���ֻ��ļ۸�");
            phone.setPrice(scanner.nextInt());
            System.out.println("�������" + (i+1) + "���ֻ�����ɫ");
            phone.setColor(scanner.next());
            phoneArr[i] = phone;
        }
        for (int i = 0; i < phoneArr.length; i++) {
            avgPrice = avgPrice + phoneArr[i].getPrice();
        }
        avgPrice = avgPrice/phoneArr.length;
        System.out.println("ƽ���۸�Ϊ��" + avgPrice);
    }
}
