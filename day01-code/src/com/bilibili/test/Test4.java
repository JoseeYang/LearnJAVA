package com.bilibili.test;

public class Test4 {
    public static void main(String[] args) {
        /* ��������
        * �ж�101-200֮���ж��ٸ���������������е����� */
        
        int sum = 0;
        for (int i = 101; i < 201; i++) {
            boolean flag = true;
            
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            
            if (flag) {
                sum++;
                System.out.print(i + " ");
            }
        }
        System.out.println("����" + sum + "������");
    }
}
