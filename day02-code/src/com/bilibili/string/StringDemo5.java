package com.bilibili.string;

public class StringDemo5 {
    public static void main(String[] args) {
        /* StringBuilder类
        * 构造方法：
        *   public StringBuilder() 创建空的StringBuilder对象
        *   public StringBuilder(String str) 根据字符串的内容创建StringBuilder对象
        * 常用方法：
        *   public StringBuilder append(任意类型) 添加数据，返回对象本身
        *   public StringBuilder reverse() 反转内容
        *   public int length() 返回长度
        *   public String toString() 转换为String字符串 */
        
//        直接打印StringBuilder对象也是可以的，打印出来的就是本身内容
    
    
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
