package com.bilibili.a04polymorphicdemo1;

public class Student extends Person {
    @Override
    public void show() {
        System.out.println("ѧ������ϢΪ��" + getName() + "," + getAge());
    }
}
