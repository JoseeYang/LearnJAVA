package com.bilibili.studentsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
//        ��ʼ�����򣬴���ArrayList����
        ArrayList<Student> studentArrayList = new ArrayList<>();

//        �������˵�
        mainMenu(studentArrayList);
    }
    
    
    //    ���˵�
    public static void mainMenu(ArrayList<Student> studentArrayList) {
        System.out.println("-------------��ӭ����ѧ������ϵͳ----------------");
        System.out.println("1�����ѧ��");
        System.out.println("2��ɾ��ѧ��");
        System.out.println("3���޸�ѧ��");
        System.out.println("4����ѯѧ��");
        System.out.println("5���˳�");
        System.out.print("����������ѡ��:");


//        ��ȡ�û�ѡ��
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 1:
                addStudent(studentArrayList);
                mainMenu(studentArrayList);
            case 2:
                delStudent(studentArrayList);
                mainMenu(studentArrayList);
            case 3:
                reStudent(studentArrayList);
                mainMenu(studentArrayList);
            case 4:
                inquiryStudent(studentArrayList);
                mainMenu(studentArrayList);
            case 5:
                System.exit(0);
        }
    }
    
    //    ���ѧ������
    public static void addStudent(ArrayList<Student> studentArrayList) {
        Scanner scanner = new Scanner(System.in);
        String sID;
        String sName;
        int sAge;
        String sAddress;
        
        while (true) {
            System.out.println("������ѧ��ID��");
            sID = scanner.next();
            
//            �ж������ID�Ƿ���ڣ����ھͱ������������룬�����ھͼ�����ȥ
            if (!isIDExist(sID, studentArrayList)) {
                break;
            }
            System.out.println("ѧ���Ѵ��ڣ�����������");
        }
        
        System.out.println("������ѧ��������");
        sName = scanner.next();
        
        System.out.println("������ѧ�����䣺");
        sAge = scanner.nextInt();
        
        System.out.println("������ѧ��סַ��");
        sAddress = scanner.next();
        
//        �������󲢴��뼯��
        Student student = new Student(sID, sName, sAge, sAddress);
        studentArrayList.add(student);
        System.out.println("���ѧ���ɹ�");
    }
    
    //    �ж������ѧ��ID�Ƿ����
    public static boolean isIDExist(String ID, ArrayList<Student> studentArrayList) {
        for (int i = 0; i < studentArrayList.size(); i++) {
            if (studentArrayList.get(i).getSID().equals(ID)) {
                return true;
            }
        }
        return false;
    }
    
    //ɾ��ѧ������
    public static void delStudent(ArrayList<Student> studentArrayList) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("������Ҫɾ����ѧ����ID��");
        String sID = scanner.next();
        
//        ���ж��Ƿ�������ѧ��
        if (isIDExist(sID, studentArrayList)) {
        
//            ���ھͻ�ȡID��������ɾ����
            int Index = whereID(sID, studentArrayList);
            studentArrayList.remove(Index);
            System.out.println("ɾ���ɹ�");
        } else {
            System.out.println("�������ѧ�����󣡼�������������");
        }
    }
    
    //    �����ѧ��ID,�����Ӧ������λ��,�����ڷ���-1
    public static int whereID(String ID, ArrayList<Student> studentArrayList) {
        for (int i = 0; i < studentArrayList.size(); i++) {
            if (studentArrayList.get(i).getSID().equals(ID)) {
                return i;
            }
        }
        return -1;
    }
    
    //    �޸�ѧ������
    public static void reStudent(ArrayList<Student> studentArrayList) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("������Ҫ���ĵ�ѧ��ID��");
        String sID = scanner.next();
        
//        Ѱ��ID��Ӧ������λ��
        int index = whereID(sID, studentArrayList);
        if (index != -1) {
            System.out.println("������ѧ��������");
            studentArrayList.get(index).setSName(scanner.next());
            System.out.println("������ѧ�����䣺");
            studentArrayList.get(index).setSAge(scanner.nextInt());
            System.out.println("������ѧ��סַ��");
            studentArrayList.get(index).setSAddress(scanner.next());
        } else {
            System.out.println("�������ѧ�����󣡼�������������");
        }
    }
    
    //    ��ѯѧ������
    public static void inquiryStudent(ArrayList<Student> studentArrayList) {
        if (studentArrayList.size() != 0) {
            System.out.println("id     ����     ����     ��ͥסַ");
            for (int i = 0; i < studentArrayList.size(); i++) {
                System.out.println(studentArrayList.get(i).getSID() + "     " + studentArrayList.get(i).getSName() + "     " + studentArrayList.get(i).getSAge() + "     " + studentArrayList.get(i).getSAddress());
            }
        } else {
            System.out.println("��ǰ��ѧ����Ϣ������Ӻ��ٲ�ѯ");
        }
    }
}