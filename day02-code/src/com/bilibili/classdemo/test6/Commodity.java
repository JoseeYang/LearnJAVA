package com.bilibili.classdemo.test6;

public class Commodity {
//    ��������
    
    private int ID;
    private String name;
    private int price;
    private int remain;
    
    //    ���췽��
    public Commodity() {
    }
    
    public Commodity(int ID, String name, int price, int remain) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.remain = remain;
    }
    
    //    get��set����
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
