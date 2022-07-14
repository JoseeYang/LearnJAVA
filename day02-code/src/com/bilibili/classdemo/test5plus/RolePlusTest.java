package com.bilibili.classdemo.test5plus;

public class RolePlusTest {
    public static void main(String[] args) {
//        创建角色
        RolePlus role1 = new RolePlus("原", 120);
        RolePlus role2 = new RolePlus("AU", 120);

//        显示角色基本信息
        role1.showDetail();
        role2.showDetail();
        
        for (int round = 1; ; round++) {
//            设置回合
            System.out.println("--------第" + round + "回合--------当前血量(" + role1.getName() + "：" + role1.getHP() + " " + role2.getName() + "：" + role2.getHP() + ")");

//            设置伤害数
            int harm;

//            role1打role2
            harm = role1.attack(role2);
            role2.injured(harm);
            if (role2.getHP() == 0) {
                System.out.println(role1.getName() + "打败了" + role2.getName());
                break;
            }
//            role2打role1
            harm = role2.attack(role1);
            role1.injured(harm);
            if (role1.getHP() == 0) {
                System.out.println(role2.getName() + "打败了" + role1.getName());
                break;
            }
        }
    }
}
