package com.bilibili.classdemo.test5;

import java.util.Scanner;

public class RoleTest {
    public static void main(String[] args) {
//        初始化角色名和血量
        String name0;
        String name1;
        int HP0;
        int HP1;

//        获取角色名和血量
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个角色名：");
        name0 = scanner.nextLine();
        System.out.println("请输入第一个角色血量：");
        HP0 = scanner.nextInt();
        
//        把数字后面的回车符去掉
        scanner.nextLine();
        
        System.out.println("请输入第二个角色名：");
        name1 = scanner.nextLine();
        System.out.println("请输入第二个角色血量：");
        HP1 = scanner.nextInt();

//        创建角色
        Role role0 = new Role(name0, HP0);
        Role role1 = new Role(name1, HP1);
        
//        设置回合数
        int round = 1;
        
//        开始打架
        while (role0.getHP() > 0 && role1.getHP() > 0) {
            System.out.println("第" + round + "回合");
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
