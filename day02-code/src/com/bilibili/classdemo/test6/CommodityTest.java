package com.bilibili.classdemo.test6;

public class CommodityTest {
    public static void main(String[] args) {
//        ������������
        Commodity commodity1 = new Commodity(1001, "����", 10, 500);
        Commodity commodity2 = new Commodity(1002, "ƻ��", 12, 1200);
        Commodity commodity3 = new Commodity(1003, "�㽶", 5, 800);
        
//        �Ѷ������������
        Commodity[] arr = new Commodity[3];
        arr[0] = commodity1;
        arr[1] = commodity2;
        arr[2] = commodity3;
        
        System.out.println("ID:" + arr[0].getID());
    }
}
