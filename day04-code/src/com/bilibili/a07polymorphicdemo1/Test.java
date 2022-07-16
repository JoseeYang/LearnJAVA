package com.bilibili.a07polymorphicdemo1;

public class Test {
    public static void main(String[] args) {
        Animal animalDog = new Dog(2,"黑");
        Animal animalCat = new Cat(3,"灰");
    
        Personal person1 = new Personal("老王", 30);
        Personal person2 = new Personal("老李", 25);
        
        person1.keepPet(animalDog, "骨头");
        person2.keepPet(animalCat, "鱼");
    
    }
}
