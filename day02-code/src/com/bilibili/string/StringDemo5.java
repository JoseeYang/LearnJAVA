package com.bilibili.string;

public class StringDemo5 {
    public static void main(String[] args) {
        /* StringBuilder��
        * ���췽����
        *   public StringBuilder() �����յ�StringBuilder����
        *   public StringBuilder(String str) �����ַ��������ݴ���StringBuilder����
        * ���÷�����
        *   public StringBuilder append(��������) ������ݣ����ض�����
        *   public StringBuilder reverse() ��ת����
        *   public int length() ���س���
        *   public String toString() ת��ΪString�ַ��� */
        
//        ֱ�Ӵ�ӡStringBuilder����Ҳ�ǿ��Եģ���ӡ�����ľ��Ǳ�������
    
    
        String s1 = "aaa";
        String s2 = "bbb";
        String s4 = "ddd";
        
        StringBuilder sb = new StringBuilder();
        sb.append(s1);
        sb.append(s2);
        sb.append("ccc");
        sb.append(s4);
    
        String s;
        s = sb.toString();
    
        System.out.println(s);
    }
}
