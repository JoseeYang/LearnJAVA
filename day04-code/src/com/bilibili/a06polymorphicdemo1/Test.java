package com.bilibili.a06polymorphicdemo1;

public class Test {
    public static void main(String[] args) {
        //��������
        Animal a = new Dog();
        //���뿴��ߣ����п��ұ�
        a.eat();
        
        //��̬�ı׶�
        //���ܵ�����������й���
        //�����ԭ��
        //�����ó�Ա������ʱ�򣬱��뿴��ߣ����п��ұ�
        //��ô�ڱ����ʱ����ȼ����ߵĸ�������û��������������û��ֱ�ӱ���
        //a.lookHome();
        
        
        //���������
        //����������;Ϳ�����
        //ϸ�ڣ�ת����ʱ����Ϲת�����ת������������ͣ��ͻᱨ��
        //Cat c = (Cat) a;
        //c.catchMouse();

/*         if(a instanceof Dog){
            Dog d = (Dog) a;
            d.lookHome();
        }else if(a instanceof Cat){
            Cat c = (Cat) a;
            c.catchMouse();
        }else{
            System.out.println("û��������ͣ��޷�ת��");
        } */
        
        //������ 14������
        //���ж�a�Ƿ�ΪDog���ͣ�����ǣ���ǿת��Dog���ͣ�ת��֮�������Ϊd
        //������ǣ���ǿת�����ֱ����false
        if(a instanceof Dog d){
            d.lookHome();
        }else if(a instanceof Cat c){
            c.catchMouse();
        }else{
            System.out.println("û��������ͣ��޷�ת��");
        }
        
    }
}

class Animal{
    public void eat(){
        System.out.println("�����ڳԶ���");
    }
}

class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("���Թ�ͷ");
    }
    
    public void lookHome(){
        System.out.println("������");
    }
}

class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("è��С���");
    }
    
    public void catchMouse(){
        System.out.println("èץ����");
    }
}