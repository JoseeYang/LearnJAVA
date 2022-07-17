package com.bilibili.interfacedemo1;

public abstract class Animal {
    /* 接口：
    * 接口是行为的抽象
    *
    * 青蛙：属性：名字，年龄   行为：吃虫子，蛙泳
    * 狗：  属性：名字，年龄   行为：吃骨头 狗刨
    * 兔子  属性：名字，年龄   行为：吃胡萝卜
    *
    *
    * 可以把游泳作为一个接口，青蛙和狗调用这个接口
    *
    *
    * 创建接口：public interface 接口名{}
    * 接口内都是抽象方法
    * 调用接口类 class implements 接口名{}
    *
    * 接口内定义的变量默认用public static final修饰
    * 接口没有构造方法
    * 接口成员方法在jdk7以前必须是抽象方法
    * jdk8可以定义有方法体的方法
    * jdk9可以定义私有方法
    *
    *
    * 类与类之间是继承关系，只能单继承
    * 类和接口之间是实现关系，可以单实现，可以多实现
    * 接口和接口是继承关系，可以单继承，可以多继承 */
    
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
    
//    吃的抽象方法
    public abstract void eat();
}
