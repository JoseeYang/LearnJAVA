package com.bilibili.a04polymorphicdemo1;

public class Person {
    /* ��̬��
     * ͬ���͵Ķ�����ֳ��Ĳ�ͬ����̬������̬
     *
     * ��̬������ʽ��
     * �������� �������� = �������;
     *
     * ��̬ǰ�᣺
     * 1.�м̳й�ϵ
     * 2.�и�������ָ���������
     * 3.�з�����д */
    
    String name;
    int age;
    
    public Person() {
    }
    
    public Person(String name, int age) {
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
    
    public void show() {
        System.out.println(name + "," + age);
    }
}
