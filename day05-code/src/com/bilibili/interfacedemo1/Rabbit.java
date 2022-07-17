package com.bilibili.interfacedemo1;

public class Rabbit extends Animal{
    
    public Rabbit() {
    }
    
    public Rabbit(String name, int age) {
        super(name, age);
    }
    
    @Override
    public void eat() {
        System.out.println("ÍÃ×Ó³ÔºúÂÜ²·");
    }
}
