package com.bilibili.a02extenddemo1;

public class Student extends Person{
    
    public Student() {
//        Ĭ�ϴ���һ��super();
        System.out.println("����ղι���");
    }
    
    public Student(String name, int age) {
        super(name, age);
        System.out.println("�����вι���");
    }
}
