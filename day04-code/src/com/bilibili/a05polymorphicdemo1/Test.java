package com.bilibili.a05polymorphicdemo1;

public class Test {
    public static void main(String[] args) {
        //�������󣨶�̬��ʽ��
        //Fu f = new Zi();
        Animal a = new Dog();
        //���ó�Ա���������뿴��ߣ�����Ҳ�����
        //���뿴��ߣ�javac��������ʱ�򣬻ῴ��ߵĸ�������û���������������У�����ɹ������û�б���ʧ�ܡ�
        //����Ҳ����ߣ�java���д����ʱ��ʵ�ʻ�ȡ�ľ�����߸����г�Ա������ֵ
        System.out.println(a.name);//����
        
        //���ó�Ա���������뿴��ߣ����п��ұ�
        //���뿴��ߣ�javac��������ʱ�򣬻ῴ��ߵĸ�������û���������������У�����ɹ������û�б���ʧ�ܡ�
        //���п��ұߣ�java���д����ʱ��ʵ�������е��������еķ�����
        a.show();///Dog --- show����
        
        //��⣺
        //Animal a = new Dog();
        //������aȥ���ñ����ͷ�����ѽ���ǵ�
        //��a��Animal���͵ģ�����Ĭ�϶����Animal�������ȥ��
        
        //��Ա������������Ķ����У���Ѹ���ĳ�Ա����Ҳ�̳��µġ�����name  �ӣ�name
        //��Ա�������������Է�����������д����ô���鷽�������ǻ�Ѹ���ķ������и��ǵġ�
    }
}


class Animal{
    String name = "����";
    
    public void show(){
        System.out.println("Animal --- show����");
    }
}

class Dog extends Animal{
    String name = "��";
    
    @Override
    public void show() {
        System.out.println("Dog --- show����");
    }
    
}

class Cat extends Animal{
    String name = "è";
    
    @Override
    public void show() {
        System.out.println("Cat --- show����");
    }
}
