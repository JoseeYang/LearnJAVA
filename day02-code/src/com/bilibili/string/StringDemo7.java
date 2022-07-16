package com.bilibili.string;

import java.util.Scanner;

public class StringDemo7 {
    public static void main(String[] args) {
        /* �����ַ�����
         * ���������ַ�����A��B
         * A��ת��������A������һλ���ƶ����ɴ����A�ܱ��B�򷵻�Ture�����򷵻�False */
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("�������һ���ַ�����");
        String strA = scanner.next();
        System.out.println("������ڶ����ַ�����");
        String strB = scanner.next();
        
        System.out.println(judgeStr(strA, strB));
    }
    
    //    �ж������ַ����Ƿ����ͨ����ת������ͬ
    public static boolean judgeStr(String strA, String strB) {
        StringBuilder sbA = new StringBuilder(strA);
        
        for (int i = 0; i < sbA.length(); i++) {
            strA = rotateStr(sbA).toString();
            if (strA.equals(strB)) {
                return true;
            }
        }
        return false;
    }
    
    //    ��תһ���ַ�������
    public static StringBuilder rotateStr(StringBuilder sb) {
        char firstChar = sb.charAt(0);
        sb.deleteCharAt(0);
        sb.append(firstChar);
        return sb;
    }
}
