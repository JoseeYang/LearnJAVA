package com.bilibili.classdemo.test5;

import java.util.Random;

public class Role {
    /* ���ְ����Ϸ��
     * ÿ����ɫ��������Ѫ������ͬ
     * xxx����xxxһ�£������xxx�˺���xxx��ʣxxxѪ
     * xxx K.O.��xxx�������ʤ�� */
    private String name;
    private int HP;
    
    //    ���캯��
    public Role() {
    }
    
    public Role(String name, int HP) {
        this.name = name;
        this.HP = HP;
    }
    
    /**
     * ��ȡ
     *
     * @return name
     */
    public String getName() {
        return name;
    }
    
    /**
     * ����
     *
     * @param name ��ɫ��
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * ��ȡ
     *
     * @return HP
     */
    public int getHP() {
        return HP;
    }
    
    /**
     * ����
     *
     * @param HP Ѫ��
     */
    public void setHP(int HP) {
        this.HP = HP;
    }
    
    //    ����������
    public void hit(String enemyName) {
        Random random = new Random();
        int harm = random.nextInt(6);
        HP = HP - harm;
        System.out.println(enemyName + "����" + name + "һ�£������" + harm + "�˺���" + name + "��ʣ" + HP + "Ѫ");
        
//        ���Ѫ��С�ڵ���0������������
        if (HP <= 0) {
            dead(enemyName);
        }
    }
    
    //    ����ɱ��������
    public void dead(String enemyName) {
        System.out.println(enemyName + " K.O.��" + name + "��ȡ����ʤ����");
    }
}
