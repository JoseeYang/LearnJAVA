package com.bilibili.a07polymorphicdemo1;

public class Test {
    public static void main(String[] args) {
        Animal animalDog = new Dog(2,"��");
        Animal animalCat = new Cat(3,"��");
    
        Personal person1 = new Personal("����", 30);
        Personal person2 = new Personal("����", 25);
        
        person1.keepPet(animalDog, "��ͷ");
        person2.keepPet(animalCat, "��");
    
    }
}
