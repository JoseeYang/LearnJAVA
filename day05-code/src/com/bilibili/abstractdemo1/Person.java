package com.bilibili.abstractdemo1;

public abstract class Person {
    /* 抽象类与抽象方法：
     * 将共性的方法抽取到父类之后，每一个子类执行的内容不能确定，就可以定义为抽象方法
     * 抽象方法在子类中必须重写
     * 只要一个类存在抽象方法，就必须声明为抽象类
     * 抽象 abstract
     * 抽象类不能实例化
     * 抽象类可以有构造方法 */
    
    
//    此处定义一个抽象方法work
    public abstract void work();
}
