package com.bilibili.classdemo.test7;

public class Phone {
    /* 定义数组存储的三部手机对象
    * 手机的属性：品牌，价格，颜色
    * 要求计算出三部手机的平均价格 */
    
    String brand;
    int price;
    String color;
    
//    构造方法
    public Phone() {
    }
    
    public Phone(String brand, int price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }
    
    /**
     * 获取
     * @return brand
     */
    public String getBrand() {
        return brand;
    }
    
    /**
     * 设置
     * @param brand 品牌
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    /**
     * 获取
     * @return price
     */
    public int getPrice() {
        return price;
    }
    
    /**
     * 设置
     * @param price 价格
     */
    public void setPrice(int price) {
        this.price = price;
    }
    
    /**
     * 获取
     * @return color
     */
    public String getColor() {
        return color;
    }
    
    /**
     * 设置
     * @param color 颜色
     */
    public void setColor(String color) {
        this.color = color;
    }
}
