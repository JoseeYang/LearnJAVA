package com.bilibili.a03extenddemo1;

public class Manager extends Employ {
    private int reward;
    
    public Manager() {
    }
    
    public Manager(String ID, String name, int money, int reward) {
        super(ID, name, money);
        this.reward = reward;
    }
    
    @Override
    public void work() {
        System.out.println("管理其他人");
    }
}
