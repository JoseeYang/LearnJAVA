package com.bilibili.classdemo.test6;

public class Commodity {
//    对象数组
    
    private int ID;
    private String name;
    private int price;
    private int remain;
    
    //    构造方法
    public Commodity() {
    }
    
    public Commodity(int ID, String name, int price, int remain) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.remain = remain;
    }
    
    //    get和set方法
    public int getID() {
        return ID;
    }
    
    public void setID(int ID) {
        this.ID = ID;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getPrice() {
        return price;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }
    
    public int getRemain() {
        return remain;
    }
    
    public void setRemain(int remain) {
        this.remain = remain;
    }
}
