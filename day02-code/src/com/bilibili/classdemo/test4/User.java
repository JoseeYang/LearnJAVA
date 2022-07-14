package com.bilibili.classdemo.test4;

public class User {
    /* ��׼JavaBean�ࣺ
     * 1.��������֪��
     * 2.��Ա����Ϊ˽��
     * 3.�����ṩ��ͺ�ȫ�����ֹ��췽��
     * 4.�ṩÿ����Ա������get��set���� */
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
     * ��ȡ
     * @return username
     */
    public String getUsername() {
        return username;
    }
    
    /**
     * ����
     * @param username �û���
     */
    public void setUsername(String username) {
        this.username = username;
    }
    
    /**
     * ��ȡ
     * @return password
     */
    public String getPassword() {
        return password;
    }
    
    /**
     * ����
     * @param password ����
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * ��ȡ
     * @return email
     */
    public String getEmail() {
        return email;
    }
    
    /**
     * ����
     * @param email ��������
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * ��ȡ
     * @return sex
     */
    public int getSex() {
        return sex;
    }
    
    /**
     * ����
     * @param sex �Ա�
     */
    public void setSex(int sex) {
        this.sex = sex;
    }
    
    /**
     * ��ȡ
     * @return age
     */
    public int getAge() {
        return age;
    }
    
    /**
     * ����
     * @param age ����
     */
    public void setAge(int age) {
        this.age = age;
    }
    
}
