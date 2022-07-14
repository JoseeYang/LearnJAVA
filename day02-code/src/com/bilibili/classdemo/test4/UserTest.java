package com.bilibili.classdemo.test4;

public class UserTest {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setUsername("Ð¡ºì");
        user1.setAge(15);
        user1.setPassword("123456");
        user1.setEmail("666@qq.com");
        user1.setSex(0);
        
        System.out.println(user1.getUsername());
        System.out.println(user1.getAge());
        System.out.println(user1.getPassword());
        System.out.println(user1.getEmail());
        System.out.println(user1.getSex());
    
        User user2 = new User("Ð¡Íõ", "654321", "555@qq.com", 1, 17);
        System.out.println(user2.getUsername());
        System.out.println(user2.getAge());
        System.out.println(user2.getPassword());
        System.out.println(user2.getEmail());
        System.out.println(user2.getSex());
    }
}
