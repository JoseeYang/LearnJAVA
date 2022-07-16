package com.bilibili.a03extenddemo1;

public class Employ {
    private String ID;
    private String name;
    private int money;
    
    
    public Employ() {
    }
    
    public Employ(String ID, String name, int money) {
        this.ID = ID;
        this.name = name;
        this.money = money;
    }
    
    
    public void work() {
        System.out.println("员工在工作");
    }
    
    public void eat() {
        System.out.println("员工在吃米饭");
    }
    
}
