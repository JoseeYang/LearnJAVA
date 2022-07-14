package com.bilibili.classdemo.test2;

public class GirlFriend {
//    get和set方法
    
    private String name;
    private int age;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
//        this关键字代表调用它的那个对象
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
}
