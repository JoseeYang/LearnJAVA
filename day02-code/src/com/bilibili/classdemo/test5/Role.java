package com.bilibili.classdemo.test5;

import java.util.Random;

public class Role {
    /* 文字版格斗游戏：
     * 每个角色的姓名，血量都不同
     * xxx打了xxx一下，造成了xxx伤害，xxx还剩xxx血
     * xxx K.O.了xxx，获得了胜利 */
    private String name;
    private int HP;
    
    //    构造函数
    public Role() {
    }
    
    public Role(String name, int HP) {
        this.name = name;
        this.HP = HP;
    }
    
    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }
    
    /**
     * 设置
     *
     * @param name 角色名
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * 获取
     *
     * @return HP
     */
    public int getHP() {
        return HP;
    }
    
    /**
     * 设置
     *
     * @param HP 血量
     */
    public void setHP(int HP) {
        this.HP = HP;
    }
    
    //    被攻击函数
    public void hit(String enemyName) {
        Random random = new Random();
        int harm = random.nextInt(6);
        HP = HP - harm;
        System.out.println(enemyName + "打了" + name + "一下，造成了" + harm + "伤害，" + name + "还剩" + HP + "血");
        
//        如果血量小于等于0调用死亡函数
        if (HP <= 0) {
            dead(enemyName);
        }
    }
    
    //    被击杀死亡函数
    public void dead(String enemyName) {
        System.out.println(enemyName + " K.O.了" + name + "，取得了胜利！");
    }
}
