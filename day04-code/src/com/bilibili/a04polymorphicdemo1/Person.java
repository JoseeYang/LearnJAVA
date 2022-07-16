package com.bilibili.a04polymorphicdemo1;

public class Person {
    /* 多态：
     * 同类型的对象表现出的不同的形态叫做多态
     *
     * 多态表现形式：
     * 父类类型 对象名称 = 子类对象;
     *
     * 多态前提：
     * 1.有继承关系
     * 2.有父类引用指向子类对象
     * 3.有方法重写 */
    
    String name;
    int age;
    
    public Person() {
    }
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
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
    
    public void show() {
        System.out.println(name + "," + age);
    }
}
