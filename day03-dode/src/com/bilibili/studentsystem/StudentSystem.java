package com.bilibili.studentsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
//        初始化程序，创建ArrayList集合
        ArrayList<Student> studentArrayList = new ArrayList<>();

//        进入主菜单
        mainMenu(studentArrayList);
    }
    
    
    //    主菜单
    public static void mainMenu(ArrayList<Student> studentArrayList) {
        System.out.println("-------------欢迎来到学生管理系统----------------");
        System.out.println("1：添加学生");
        System.out.println("2：删除学生");
        System.out.println("3：修改学生");
        System.out.println("4：查询学生");
        System.out.println("5：退出");
        System.out.print("请输入您的选择:");


//        获取用户选择
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
    
    //    添加学生函数
    public static void addStudent(ArrayList<Student> studentArrayList) {
        Scanner scanner = new Scanner(System.in);
        String sID;
        String sName;
        int sAge;
        String sAddress;
        
        while (true) {
            System.out.println("请输入学生ID：");
            sID = scanner.next();
            
//            判断输入的ID是否存在，存在就报错让重新输入，不存在就继续下去
            if (!isIDExist(sID, studentArrayList)) {
                break;
            }
            System.out.println("学号已存在，请重新输入");
        }
        
        System.out.println("请输入学生姓名：");
        sName = scanner.next();
        
        System.out.println("请输入学生年龄：");
        sAge = scanner.nextInt();
        
        System.out.println("请输入学生住址：");
        sAddress = scanner.next();
        
//        创建对象并存入集合
        Student student = new Student(sID, sName, sAge, sAddress);
        studentArrayList.add(student);
        System.out.println("添加学生成功");
    }
    
    //    判断输入的学生ID是否存在
    public static boolean isIDExist(String ID, ArrayList<Student> studentArrayList) {
        for (int i = 0; i < studentArrayList.size(); i++) {
            if (studentArrayList.get(i).getSID().equals(ID)) {
                return true;
            }
        }
        return false;
    }
    
    //删除学生函数
    public static void delStudent(ArrayList<Student> studentArrayList) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("请输入要删除的学生的ID：");
        String sID = scanner.next();
        
//        先判断是否存在这个学号
        if (isIDExist(sID, studentArrayList)) {
        
//            存在就获取ID的索引，删掉它
            int Index = whereID(sID, studentArrayList);
            studentArrayList.remove(Index);
            System.out.println("删除成功");
        } else {
            System.out.println("你输入的学号有误！即将返回主界面");
        }
    }
    
    //    输入的学生ID,输出对应的索引位置,不存在返回-1
    public static int whereID(String ID, ArrayList<Student> studentArrayList) {
        for (int i = 0; i < studentArrayList.size(); i++) {
            if (studentArrayList.get(i).getSID().equals(ID)) {
                return i;
            }
        }
        return -1;
    }
    
    //    修改学生函数
    public static void reStudent(ArrayList<Student> studentArrayList) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("请输入要更改的学生ID：");
        String sID = scanner.next();
        
//        寻找ID对应的索引位置
        int index = whereID(sID, studentArrayList);
        if (index != -1) {
            System.out.println("请输入学生姓名：");
            studentArrayList.get(index).setSName(scanner.next());
            System.out.println("请输入学生年龄：");
            studentArrayList.get(index).setSAge(scanner.nextInt());
            System.out.println("请输入学生住址：");
            studentArrayList.get(index).setSAddress(scanner.next());
        } else {
            System.out.println("你输入的学号有误！即将返回主界面");
        }
    }
    
    //    查询学生函数
    public static void inquiryStudent(ArrayList<Student> studentArrayList) {
        if (studentArrayList.size() != 0) {
            System.out.println("id     姓名     年龄     家庭住址");
            for (int i = 0; i < studentArrayList.size(); i++) {
                System.out.println(studentArrayList.get(i).getSID() + "     " + studentArrayList.get(i).getSName() + "     " + studentArrayList.get(i).getSAge() + "     " + studentArrayList.get(i).getSAddress());
            }
        } else {
            System.out.println("当前无学生信息，请添加后再查询");
        }
    }
}