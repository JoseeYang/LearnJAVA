package com.bilibili.test;

import java.util.Random;

public class Test5 {
    public static void main(String[] args) {
        /* ������֤�룺
         * ���巽������һ�������λ��֤��
         * ��֤���ʽ��
         *   ����Ϊ5
         *   ǰ��λΪ��д��Сд��ĸ
         *   ���һλ������ */
        
        String str = randomCode();
        System.out.println(str);
    }
    
    public static String randomCode() {
        String str = "";
        
//        ����һ�����飬�����Ŵ�д��ĸ��Сд��ĸ
        char[] alphabet = new char[52];
        
//        ���Сд��ĸ
        for (int i = 0, j = 97, g = 0; i < 26; i++, g++) {
            alphabet[i] = (char) (j + g);
        }
//        ��Ŵ�д��ĸ
        for (int i = 26, j = 65, g = 0; i < 52; i++, g++) {
            alphabet[i] = (char) (j + g);
        }
        
//        ����һ�����飬����������0-9
        int[] digitalTable = new int[10];
        for (int i = 0; i < 10; i++) {
            digitalTable[i] = i ;
        }
    
//        ����һ�����Դ���ڴ�Сд��������������Σ������������������һ��
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            str = str + alphabet[random.nextInt(0,52)];
        }
        str = str + digitalTable[random.nextInt(0,10)];
        
        return str;
    }
}
