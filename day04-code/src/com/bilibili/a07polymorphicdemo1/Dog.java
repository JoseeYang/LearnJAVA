package com.bilibili.a07polymorphicdemo1;

public class Dog extends Animal{
    
    public Dog() {
    }
    
    public Dog(int age, String color) {
        super(age, color);
    }
    
    public void lookHome(){
        System.out.println("����");
    }
    
    @Override
    public void eat(String something){
        System.out.println(getAge() + "���" + getColor() + "��ɫ�Ĺ���ֻǰ�������ı�ס" + something + "�ͳ�");
    }
}
