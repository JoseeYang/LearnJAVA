package com.bilibili.classdemo.test4;

public class User {
    /* 标准JavaBean类：
     * 1.类名见名知意
     * 2.成员变量为私有
     * 3.至少提供午餐和全参两种构造方法
     * 4.提供每个成员变量的get和set方法 */
    private String username;
    private String password;
    private String email;
    private int sex;
    private int age;
    
    
    public User() {
    }
    
    public User(String username, String password, String email, int sex, int age) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.sex = sex;
        this.age = age;
    }
    
    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }
    
    /**
     * 设置
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }
    
    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }
    
    /**
     * 设置
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * 获取
     * @return email
     */
    public String getEmail() {
        return email;
    }
    
    /**
     * 设置
     * @param email 电子邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * 获取
     * @return sex
     */
    public int getSex() {
        return sex;
    }
    
    /**
     * 设置
     * @param sex 性别
     */
    public void setSex(int sex) {
        this.sex = sex;
    }
    
    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }
    
    /**
     * 设置
     * @param age 年龄
     */
    public void setAge(int age) {
        this.age = age;
    }
    
}
