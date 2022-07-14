package com.bilibili.classdemo.test1;

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.brand = "»ªÎª";
        phone.price = 887;
        
        System.out.println(phone.brand);
        System.out.println(phone.price);
        phone.call();
        phone.send();
    }
}
