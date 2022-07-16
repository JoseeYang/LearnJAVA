package com.bilibili.a02extenddemo1;

public class Student extends Person{
    
    public Student() {
//        默认存在一个super();
        System.out.println("子类空参构造");
    }
    
    public Student(String name, int age) {
        super(name, age);
        System.out.println("子类有参构造");
    }
}
