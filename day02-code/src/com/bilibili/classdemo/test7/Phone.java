package com.bilibili.classdemo.test7;

public class Phone {
    /* ��������洢�������ֻ�����
    * �ֻ������ԣ�Ʒ�ƣ��۸���ɫ
    * Ҫ�����������ֻ���ƽ���۸� */
    
    String brand;
    int price;
    String color;
    
//    ���췽��
    public Phone() {
    }
    
    public Phone(String brand, int price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }
    
    /**
     * ��ȡ
     * @return brand
     */
    public String getBrand() {
        return brand;
    }
    
    /**
     * ����
     * @param brand Ʒ��
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    /**
     * ��ȡ
     * @return price
     */
    public int getPrice() {
        return price;
    }
    
    /**
     * ����
     * @param price �۸�
     */
    public void setPrice(int price) {
        this.price = price;
    }
    
    /**
     * ��ȡ
     * @return color
     */
    public String getColor() {
        return color;
    }
    
    /**
     * ����
     * @param color ��ɫ
     */
    public void setColor(String color) {
        this.color = color;
    }
}
