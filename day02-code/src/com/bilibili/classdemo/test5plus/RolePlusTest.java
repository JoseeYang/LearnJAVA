package com.bilibili.classdemo.test5plus;

public class RolePlusTest {
    public static void main(String[] args) {
//        ������ɫ
        RolePlus role1 = new RolePlus("ԭ", 120);
        RolePlus role2 = new RolePlus("AU", 120);

//        ��ʾ��ɫ������Ϣ
        role1.showDetail();
        role2.showDetail();
        
        for (int round = 1; ; round++) {
//            ���ûغ�
            System.out.println("--------��" + round + "�غ�--------��ǰѪ��(" + role1.getName() + "��" + role1.getHP() + " " + role2.getName() + "��" + role2.getHP() + ")");

//            �����˺���
            int harm;

//            role1��role2
            harm = role1.attack(role2);
            role2.injured(harm);
            if (role2.getHP() == 0) {
                System.out.println(role1.getName() + "�����" + role2.getName());
                break;
            }
//            role2��role1
            harm = role2.attack(role1);
            role1.injured(harm);
            if (role1.getHP() == 0) {
                System.out.println(role2.getName() + "�����" + role1.getName());
                break;
            }
        }
    }
}
