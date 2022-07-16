package com.bilibili.studentsystem;

public class Student {
    private String sID;
    private String sName;
    private int sAge;
    private String sAddress;
    
//    构造函数
    public Student() {
    }
    
    public Student(String sID, String sName, int sAge, String sAddress) {
        this.sID = sID;
        this.sName = sName;
        this.sAge = sAge;
        this.sAddress = sAddress;
    }
    
    /**
     * 获取
     * @return sID
     */
    public String getSID() {
        return sID;
    }
    
    /**
     * 设置
     * @param sID 学号
     */
    public void setSID(String sID) {
        this.sID = sID;
    }
    
    /**
     * 获取
     * @return sName
     */
    public String getSName() {
        return sName;
    }
    
    /**
     * 设置
     * @param sName 学生姓名
     */
    public void setSName(String sName) {
        this.sName = sName;
    }
    
    /**
     * 获取
     * @return sAge
     */
    public int getSAge() {
        return sAge;
    }
    
    /**
     * 设置
     * @param sAge 学生年龄
     */
    public void setSAge(int sAge) {
        this.sAge = sAge;
    }
    
    /**
     * 获取
     * @return sAddress
     */
    public String getSAddress() {
        return sAddress;
    }
    
    /**
     * 设置
     * @param sAddress 学生地址
     */
    public void setSAddress(String sAddress) {
        this.sAddress = sAddress;
    }
}
