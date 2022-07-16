package com.bilibili.a07polymorphicdemo1;

public class Cat extends Animal{
    
    public Cat() {
    }
    
    public Cat(int age, String color) {
        super(age, color);
    }
    
    public void catchMouse(){
        System.out.println("抓老鼠");
    }
    
    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁的" + getColor() + "颜色的猫眯着眼睛侧着头吃" +something);
    }
}
