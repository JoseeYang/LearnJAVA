package com.bilibili.a01extenddemo1;

public class AnimalTest {
    public static void main(String[] args) {
        Cat dollCat = new Cat();
        Cat chineseRaccoonCat = new Cat();
        DogHusky husky = new DogHusky();
        DogTeddy teddy = new DogTeddy();
    
        System.out.println("布偶猫正在：");
        dollCat.eat();
        dollCat.drink();
        dollCat.mouse();
    
        System.out.println("中国狸花猫正在：");
        chineseRaccoonCat.eat();
        chineseRaccoonCat.drink();
        chineseRaccoonCat.mouse();
    
        System.out.println("哈士奇正在：");
        husky.eat();
        husky.drink();
        husky.inHome();
        husky.harmHouse();
    
        System.out.println("泰迪正在：");
        teddy.eat();
        teddy.drink();
        teddy.inHome();
        teddy.rub();
    }
}
