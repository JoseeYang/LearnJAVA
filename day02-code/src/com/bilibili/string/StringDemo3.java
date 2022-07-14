package com.bilibili.string;

public class StringDemo3 {
    public static void main(String[] args) {
    /* 字符串的比较的方法：
    * boolean equals(str) 完全一样才是ture
    * boolean equalsIgnoreCase(str) 忽略大小写的比较 */
    
        String s1 = "abc";
        String s2 = new String("abc");
        String s3 = "Abc";
    
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
    }
}
