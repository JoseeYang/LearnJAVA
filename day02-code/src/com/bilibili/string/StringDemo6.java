package com.bilibili.string;

import java.util.StringJoiner;

public class StringDemo6 {
    public static void main(String[] args) {
        /* StringJoiner类：
         * 构造方法：
         *   public StringJoiner(间隔符号) 创建一个StringJoiner对象，指定拼接时候的间隔符号
         *   public StringJoiner(间隔符号，开始符号，结束符号) 创建一个StringJoiner对象，指定间隔符号，开始和结束符号
         * 成员方法：
         *  public StringJoiner add(添加的内容) 添加数据，返回自身
         *  public int length() 返回长度
         *  public String toString() 返回字符串 */
    
//        StringJoiner添加只能添加字符串，可以强行转为字符串
        
        
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
