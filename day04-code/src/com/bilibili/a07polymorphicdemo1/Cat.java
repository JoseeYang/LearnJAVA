package com.bilibili.a07polymorphicdemo1;

public class Cat extends Animal{
    
    public Cat() {
    }
    
    public Cat(int age, String color) {
        super(age, color);
    }
    
    public void catchMouse(){
        System.out.println("ץ����");
    }
    
    @Override
    public void eat(String something) {
        System.out.println(getAge() + "���" + getColor() + "��ɫ��è�����۾�����ͷ��" +something);
    }
}
