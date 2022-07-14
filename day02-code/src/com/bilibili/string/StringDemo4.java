package com.bilibili.string;

public class StringDemo4 {
    public static void main(String[] args) {
        /* 遍历字符串
        * public char charAt(int index)根据索引返回字符
        * public int length()返回字符串的长度 */
    
        String str = "钢门123吹小雪";
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
    }
}
