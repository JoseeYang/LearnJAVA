package com.bilibili.classdemo.test1.test3;

public class Student {
    /* ���췽����
     * ���η� ���� ��������{
     *       �����壻
     *}
     * 1.��������������ͬ
     * 2.û�з���ֵ���ͣ�û��void
     * 3.û�о���ķ���ֵ��û��return */
    
    private String name;
    private int age;
    
    //    get��set����
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
    
    //    �չ��캯��
    public Student() {
    }
    
    //    �вι��캯��
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
