package com.bilibili.a01extenddemo1;

public class AnimalTest {
    public static void main(String[] args) {
        Cat dollCat = new Cat();
        Cat chineseRaccoonCat = new Cat();
        DogHusky husky = new DogHusky();
        DogTeddy teddy = new DogTeddy();
    
        System.out.println("��żè���ڣ�");
        dollCat.eat();
        dollCat.drink();
        dollCat.mouse();
    
        System.out.println("�й��껨è���ڣ�");
        chineseRaccoonCat.eat();
        chineseRaccoonCat.drink();
        chineseRaccoonCat.mouse();
    
        System.out.println("��ʿ�����ڣ�");
        husky.eat();
        husky.drink();
        husky.inHome();
        husky.harmHouse();
    
        System.out.println("̩�����ڣ�");
        teddy.eat();
        teddy.drink();
        teddy.inHome();
        teddy.rub();
    }
}
