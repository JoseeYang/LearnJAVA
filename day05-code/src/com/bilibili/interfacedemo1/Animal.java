package com.bilibili.interfacedemo1;

public abstract class Animal {
    /* �ӿڣ�
    * �ӿ�����Ϊ�ĳ���
    *
    * ���ܣ����ԣ����֣�����   ��Ϊ���Գ��ӣ���Ӿ
    * ����  ���ԣ����֣�����   ��Ϊ���Թ�ͷ ����
    * ����  ���ԣ����֣�����   ��Ϊ���Ժ��ܲ�
    *
    *
    * ���԰���Ӿ��Ϊһ���ӿڣ����ܺ͹���������ӿ�
    *
    *
    * �����ӿڣ�public interface �ӿ���{}
    * �ӿ��ڶ��ǳ��󷽷�
    * ���ýӿ��� class implements �ӿ���{}
    *
    * �ӿ��ڶ���ı���Ĭ����public static final����
    * �ӿ�û�й��췽��
    * �ӿڳ�Ա������jdk7��ǰ�����ǳ��󷽷�
    * jdk8���Զ����з�����ķ���
    * jdk9���Զ���˽�з���
    *
    *
    * ������֮���Ǽ̳й�ϵ��ֻ�ܵ��̳�
    * ��ͽӿ�֮����ʵ�ֹ�ϵ�����Ե�ʵ�֣����Զ�ʵ��
    * �ӿںͽӿ��Ǽ̳й�ϵ�����Ե��̳У����Զ�̳� */
    
    private String name;
    private int age;
    
    
    public Animal() {
    }
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
//    �Եĳ��󷽷�
    public abstract void eat();
}
