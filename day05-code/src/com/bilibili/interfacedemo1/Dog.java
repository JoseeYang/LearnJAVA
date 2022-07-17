package com.bilibili.interfacedemo1;

public class Dog extends Animal implements Swim{
    
    public Dog() {
    }
    
    public Dog(String name, int age) {
        super(name, age);
    }
    
    @Override
    public void eat() {
        System.out.println("���Թ�ͷ");
    }
    
    @Override
    public void swim() {
        System.out.println("�����Թ���");
    }
}
