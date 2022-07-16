package com.bilibili.a03extenddemo1;

public class Cook extends Employ {
    public Cook() {
    }
    
    public Cook(String ID, String name, int money) {
        super(ID, name, money);
    }
    
    @Override
    public void work() {
        System.out.println("³´²Ë");
    }
}
