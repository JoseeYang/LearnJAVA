package com.bilibili.test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        /* ���ɻ�Ʊ��
         * ��Ʊ�۸��յ���������ͷ�Ȳվ��ò��շѡ������Ʊԭ�ۡ��·ݺ�ͷ�Ȳջ򾭼ò�
         * �������¹�������Ʊ�۸�������5-10�£�ͷ�Ȳ�9�ۣ����ò�8.5�ۣ�������11�µ�����4�£�ͷ�Ȳ�7�ۣ����ò�6.5�� */
        
        double oldPrice;
        int month;
        int place;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("�������Ʊԭ�ۣ�");
        oldPrice = scanner.nextInt();
        System.out.println("�����뵱ǰ�·ݣ�");
        month = scanner.nextInt();
        System.out.println("����������Ĳ�λ(1��ʾͷ�Ȳգ�2��ʾ���ò�)��");
        place = scanner.nextInt();
    
        double newPrice = calPrice(oldPrice, month, place);
        System.out.println("����Ҫ����ǮΪ��" + newPrice);
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
