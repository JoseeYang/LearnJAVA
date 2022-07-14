package com.bilibili.classdemo.test1.test3;

public class StudentTest {
    public static void main(String[] args) {
//        用无参构造方法
        Student student1 = new Student();
        student1.setName("小王");
        student1.setAge(18);
        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        
//        用带参数的构造方法
        Student student2 = new Student("小红", 15);
        System.out.println(student2.getName());
        System.out.println(student2.getAge());
    }
}
