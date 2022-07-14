package com.bilibili.classdemo.test5plus;

import java.util.Random;

public class RolePlus {
    //    ��ɫ������Ϣ
    private String name;
    private int HP;
    private String sex;
    private String face;
    
    //    face��ò��Ϣ
    String[] boyFace = {"��������", "��������", "��òӢ��", "��ٶ���", "��òƽƽ", "һ����Ϳ", "��Ŀ����"};
    String[] girlFace = {"��ۼ����", "��������", "��������", "��Ľ���", "��òƽƽ", "��ò��ª", "�Ҳ��̶�"};
    
    //    attack ����������
    String[] attacksDesc = {
            "%sʹ����һ�С����Ķ�����ת���Է������һ����%s���ĵ���̨Ѩ��ȥ��",
            "%sʹ����һ�С��ο�̽צ�������������԰���б���Ϊץ����%s��",
            "%s���һ���������·���һ�С�����׹�ء�������%s˫�ȡ�",
            "%s�������ƣ�һ˲�����ı��Ѫ�죬һʽ�������ס�������%s��",
            "%s���ַ������ָ�����һ�С�û�����������ʵʵ�Ĵ���%s��",
            "%s�ϲ������������У�һ�С���������������������%s��"
    };
    
    //    injured ��������
    String[] injuredDesc = {
            "���%s���˰벽��û������",
            "�����%s���һ������",
            "���һ�����У�%sʹ��������",
            "���%sʹ����ƺ���һ������Ȼ���˵�����",
            "���%sҡҡ�λΣ�һ��ˤ���ڵ�",
            "���%s��ɫһ�±�òҰף������˺ü���",
            "������䡻��һ����%s������Ѫ�������",
            "���%sһ���ҽУ���̲�����������ȥ"
    };
    
    //    ���캯��
    public RolePlus() {
    }
    
    public RolePlus(String name, int HP) {
        this.name = name;
        this.HP = HP;

//        ��ȡ����Ա������
        Random random = new Random();
        int sexIndex = random.nextInt(0, 2);
        if (sexIndex == 0) {
            this.sex = "Ů";
        } else {
            this.sex = "��";
        }
        
        int faceIndex = random.nextInt(0, 7);
        if (this.sex.equals("��")) {
            this.face = boyFace[faceIndex];
        } else {
            this.face = girlFace[faceIndex];
        }
    }
    
    //    get��set����
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getHP() {
        return HP;
    }
    
    public void setHP(int HP) {
        this.HP = HP;
    }
    
    public String getSex() {
        return sex;
    }
    
    public void setSex(String sex) {
        this.sex = sex;
    }
    
    public String getFace() {
        return face;
    }
    
    public void setFace(String face) {
        this.face = face;
    }
    
//    ��ʾ��ɫ����
    public void showDetail(){
        System.out.println("��ɫ����" + name);
        System.out.println("Ѫ����" + HP);
        System.out.println("�Ա�" + sex);
        System.out.println("��ò��" + face);
    }
    
    
    //    ��������
    public int attack(RolePlus role) {
//        ��ȡ�˺���
        Random random = new Random();
        int harm = random.nextInt(0, 21);
//        ��ʾ��������
        int ackArrIndex = random.nextInt(attacksDesc.length);
        System.out.printf(attacksDesc[ackArrIndex], this.name, role.name);
        
        return harm;
    }
    
    //    �ܻ�����
    public void injured(int harm) {
//        �����˺�
        HP = HP - harm;
        if (HP <= 0) {
            HP = 0;
        }
        
//        �����¼����������˺����˵��أ��ж�
//        0����û�д��������¼�,-1��ʾ�����������¼�
        Random random = new Random();
        int injuredIndex = 0;
        if (harm == 0) {
            injuredIndex = -1;
            System.out.printf(injuredDesc[0], name);
        }
        if (HP == 0) {
            injuredIndex = -1;
            System.out.printf(injuredDesc[7], name);
        }
        if (injuredIndex == 0) {
            injuredIndex = random.nextInt(1, 7);
            System.out.printf(injuredDesc[injuredIndex],name);
        }
        System.out.printf("����%s�����" + harm + "���˺���",name);
        System.out.println();
    }
}
