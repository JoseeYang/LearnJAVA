package com.bilibili.studentsystem;

public class Student {
    private String sID;
    private String sName;
    private int sAge;
    private String sAddress;
    
//    ���캯��
    public Student() {
    }
    
    public Student(String sID, String sName, int sAge, String sAddress) {
        this.sID = sID;
        this.sName = sName;
        this.sAge = sAge;
        this.sAddress = sAddress;
    }
    
    /**
     * ��ȡ
     * @return sID
     */
    public String getSID() {
        return sID;
    }
    
    /**
     * ����
     * @param sID ѧ��
     */
    public void setSID(String sID) {
        this.sID = sID;
    }
    
    /**
     * ��ȡ
     * @return sName
     */
    public String getSName() {
        return sName;
    }
    
    /**
     * ����
     * @param sName ѧ������
     */
    public void setSName(String sName) {
        this.sName = sName;
    }
    
    /**
     * ��ȡ
     * @return sAge
     */
    public int getSAge() {
        return sAge;
    }
    
    /**
     * ����
     * @param sAge ѧ������
     */
    public void setSAge(int sAge) {
        this.sAge = sAge;
    }
    
    /**
     * ��ȡ
     * @return sAddress
     */
    public String getSAddress() {
        return sAddress;
    }
    
    /**
     * ����
     * @param sAddress ѧ����ַ
     */
    public void setSAddress(String sAddress) {
        this.sAddress = sAddress;
    }
}
