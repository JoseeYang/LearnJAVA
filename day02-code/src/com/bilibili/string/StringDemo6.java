package com.bilibili.string;

import java.util.StringJoiner;

public class StringDemo6 {
    public static void main(String[] args) {
        /* StringJoiner�ࣺ
         * ���췽����
         *   public StringJoiner(�������) ����һ��StringJoiner����ָ��ƴ��ʱ��ļ������
         *   public StringJoiner(������ţ���ʼ���ţ���������) ����һ��StringJoiner����ָ��������ţ���ʼ�ͽ�������
         * ��Ա������
         *  public StringJoiner add(��ӵ�����) ������ݣ���������
         *  public int length() ���س���
         *  public String toString() �����ַ��� */
    
//        StringJoiner���ֻ������ַ���������ǿ��תΪ�ַ���
        
        
        int[] arr = {11, 22, 33, 44, 55};
        String s;
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < arr.length; i++) {
            sj.add(arr[i] + "");
        }
        s = sj.toString();
        System.out.println(s);
    }
}
