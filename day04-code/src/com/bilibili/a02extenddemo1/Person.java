package com.bilibili.a02extenddemo1;

public class Person {
    String name;
    int age;
    
    public Person() {
        System.out.println("�����޲ι���");
    }
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("�����вι���");
    }
}
