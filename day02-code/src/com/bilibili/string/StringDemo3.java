package com.bilibili.string;

public class StringDemo3 {
    public static void main(String[] args) {
    /* �ַ����ıȽϵķ�����
    * boolean equals(str) ��ȫһ������ture
    * boolean equalsIgnoreCase(str) ���Դ�Сд�ıȽ� */
    
        String s1 = "abc";
        String s2 = new String("abc");
        String s3 = "Abc";
    
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
    }
}
