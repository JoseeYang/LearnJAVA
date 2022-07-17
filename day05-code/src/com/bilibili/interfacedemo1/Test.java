package com.bilibili.interfacedemo1;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("นทนท", 10);
        Frog frog = new Frog("ธ๒๓ก", 2);
        Rabbit rabbit = new Rabbit("อรืำ", 3);
        
        dog.eat();
        dog.swim();
        
        frog.eat();
        frog.swim();
        
        rabbit.eat();
    }
}
