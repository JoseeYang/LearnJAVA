package com.bilibili.classdemo.test5;

import java.util.Scanner;

public class RoleTest {
    public static void main(String[] args) {
//        ��ʼ����ɫ����Ѫ��
        String name0;
        String name1;
        int HP0;
        int HP1;

//        ��ȡ��ɫ����Ѫ��
        Scanner scanner = new Scanner(System.in);
        System.out.println("�������һ����ɫ����");
        name0 = scanner.nextLine();
        System.out.println("�������һ����ɫѪ����");
        HP0 = scanner.nextInt();
        
//        �����ֺ���Ļس���ȥ��
        scanner.nextLine();
        
        System.out.println("������ڶ�����ɫ����");
        name1 = scanner.nextLine();
        System.out.println("������ڶ�����ɫѪ����");
        HP1 = scanner.nextInt();

//        ������ɫ
        Role role0 = new Role(name0, HP0);
        Role role1 = new Role(name1, HP1);
        
//        ���ûغ���
        int round = 1;
        
//        ��ʼ���
        while (role0.getHP() > 0 && role1.getHP() > 0) {
            System.out.println("��" + round + "�غ�");
            role0.hit(role1.getName());
            if (role0.getHP() <=0) {
                break;
            }
            role1.hit(role0.getName());
            System.out.println("--------------------");
            round++;
        }
    }
}
