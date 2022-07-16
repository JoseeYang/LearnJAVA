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
            System.out.println("年龄为" + age + "岁的" + name + "养了一只" + dog.getColor() + "颜色的" + dog.getAge() + "岁的狗");
            dog.eat(something);
        } else if (animal instanceof Cat cat) {
            System.out.println("年龄为" + age + "岁的" + name + "养了一只" + cat.getColor() + "颜色的" + cat.getAge() + "岁的猫");
    
            cat.eat(something);
        }
    }
}
