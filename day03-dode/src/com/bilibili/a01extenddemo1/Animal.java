package com.bilibili.a01extenddemo1;

public class Animal {
    /* 继承 extends：
     * JAVA中只支持单继承，不允许多继承，但是可以多层继承
     * JAV所有的类都直接或简介继承于Object类
     * 构造方法不论修饰都无法继承
     * 成员变量不论修饰都可以继承，但是私有无法访问
     * 成员方法可以继承虚方法（非private 非static 非final）
     * 虚方法表 */
    
    public Animal() {
    }
    
    public void eat() {
        System.out.println("正在吃");
    }
    
    public void drink() {
        System.out.println("在喝水");
    }
}
