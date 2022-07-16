package com.bilibili.a04polymorphicdemo1;

public class Admin extends Person{
    @Override
    public void show() {
        System.out.println("管理员的信息为：" + getName() + "," + getAge());
    }
}
