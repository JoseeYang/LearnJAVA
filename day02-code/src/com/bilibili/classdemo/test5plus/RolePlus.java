package com.bilibili.classdemo.test5plus;

import java.util.Random;

public class RolePlus {
    //    角色基础信息
    private String name;
    private int HP;
    private String sex;
    private String face;
    
    //    face容貌信息
    String[] boyFace = {"风流俊雅", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
    String[] girlFace = {"美奂绝伦", "沉鱼落雁", "婷婷玉立", "身材娇好", "相貌平平", "相貌简陋", "惨不忍睹"};
    
    //    attack 攻击描述：
    String[] attacksDesc = {
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
    };
    
    //    injured 受伤描述
    String[] injuredDesc = {
            "结果%s退了半步，没有受伤",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果『轰』的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去"
    };
    
    //    构造函数
    public RolePlus() {
    }
    
    public RolePlus(String name, int HP) {
        this.name = name;
        this.HP = HP;

//        获取随机性别和面容
        Random random = new Random();
        int sexIndex = random.nextInt(0, 2);
        if (sexIndex == 0) {
            this.sex = "女";
        } else {
            this.sex = "男";
        }
        
        int faceIndex = random.nextInt(0, 7);
        if (this.sex.equals("男")) {
            this.face = boyFace[faceIndex];
        } else {
            this.face = girlFace[faceIndex];
        }
    }
    
    //    get和set方法
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
    
//    显示角色详情
    public void showDetail(){
        System.out.println("角色名：" + name);
        System.out.println("血量：" + HP);
        System.out.println("性别：" + sex);
        System.out.println("容貌：" + face);
    }
    
    
    //    攻击函数
    public int attack(RolePlus role) {
//        获取伤害数
        Random random = new Random();
        int harm = random.nextInt(0, 21);
//        显示攻击文字
        int ackArrIndex = random.nextInt(attacksDesc.length);
        System.out.printf(attacksDesc[ackArrIndex], this.name, role.name);
        
        return harm;
    }
    
    //    受击函数
    public void injured(int harm) {
//        结算伤害
        HP = HP - harm;
        if (HP <= 0) {
            HP = 0;
        }
        
//        特殊事件（毫发无伤和重伤倒地）判断
//        0代表没有触发特殊事件,-1表示触发了特殊事件
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
        System.out.printf("。对%s造成了" + harm + "点伤害。",name);
        System.out.println();
    }
}
