package com.bilibili.a04polymorphicdemo1;

public class Teacher extends Person{
    @Override
    public void show() {
        System.out.println("��ʦ����ϢΪ��" + getName() + "," + getAge());
    }
}
