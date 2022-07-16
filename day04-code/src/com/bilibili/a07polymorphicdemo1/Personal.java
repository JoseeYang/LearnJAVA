package com.bilibili.a07polymorphicdemo1;

public class Personal {
    private String name;
    private int age;
    
    public Personal() {
    }
    
    public Personal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void keepPet(Animal animal,String something){

        if (animal instanceof Dog dog) {
            System.out.println("����Ϊ" + age + "���" + name + "����һֻ" + dog.getColor() + "��ɫ��" + dog.getAge() + "��Ĺ�");
            dog.eat(something);
        } else if (animal instanceof Cat cat) {
            System.out.println("����Ϊ" + age + "���" + name + "����һֻ" + cat.getColor() + "��ɫ��" + cat.getAge() + "���è");
    
            cat.eat(something);
        }
    }
}
