package com.bilibili.a01extenddemo1;

public class Zi extends Fu{
    String name = "Zi";
    
    public void show(){
        String name = "Zishow";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
