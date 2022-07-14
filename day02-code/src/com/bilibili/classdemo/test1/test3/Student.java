package com.bilibili.classdemo.test1.test3;

public class Student {
    /* 构造方法：
     * 修饰符 类名 （参数）{
     *       方法体；
     *}
     * 1.方法名和类名相同
     * 2.没有返回值类型，没有void
     * 3.没有具体的返回值，没有return */
    
    private String name;
    private int age;
    
    //    get与set方法
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    //    空构造函数
    public Student() {
    }
    
    //    有参构造函数
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
