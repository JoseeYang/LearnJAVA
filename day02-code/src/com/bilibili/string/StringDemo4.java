package com.bilibili.string;

public class StringDemo4 {
    public static void main(String[] args) {
        /* �����ַ���
        * public char charAt(int index)�������������ַ�
        * public int length()�����ַ����ĳ��� */
    
        String str = "����123��Сѩ";
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
    }
}
