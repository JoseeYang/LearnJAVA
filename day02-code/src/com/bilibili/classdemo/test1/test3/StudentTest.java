package com.bilibili.classdemo.test1.test3;

public class StudentTest {
    public static void main(String[] args) {
//        ���޲ι��췽��
        Student student1 = new Student();
        student1.setName("С��");
        student1.setAge(18);
        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        
//        �ô������Ĺ��췽��
        Student student2 = new Student("С��", 15);
        System.out.println(student2.getName());
        System.out.println(student2.getAge());
    }
}
