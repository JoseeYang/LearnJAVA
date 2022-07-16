package com.bilibili.string;

import java.util.Scanner;

public class StringDemo7 {
    public static void main(String[] args) {
        /* 调整字符串：
         * 给定两个字符串，A和B
         * A旋转操作就是A的左移一位，移动若干次如果A能变成B则返回Ture，否则返回False */
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个字符串：");
        String strA = scanner.next();
        System.out.println("请输入第二个字符串：");
        String strB = scanner.next();
        
        System.out.println(judgeStr(strA, strB));
    }
    
    //    判断两个字符串是否可以通过旋转操作相同
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
    
    //    旋转一次字符串函数
    public static StringBuilder rotateStr(StringBuilder sb) {
        char firstChar = sb.charAt(0);
        sb.deleteCharAt(0);
        sb.append(firstChar);
        return sb;
    }
}
