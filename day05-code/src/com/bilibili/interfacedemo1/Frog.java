package com.bilibili.interfacedemo1;

public class Frog extends Animal implements Swim{
    
    public Frog() {
    }
    
    public Frog(String name, int age) {
        super(name, age);
    }
    
    @Override
    public void eat() {
        System.out.println("���ܳԳ���");
    }
    
    @Override
    public void swim() {
        System.out.println("��������Ӿ");
    }
}
