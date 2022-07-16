package com.bilibili.a04polymorphicdemo1;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("ѧ��");
        student.setAge(15);
    
        Teacher teacher = new Teacher();
        teacher.setName("��ʦ");
        teacher.setAge(22);
    
        Admin admin = new Admin();
        admin.setName("����Ա");
        admin.setAge(28);
        
        register(student);
        register(teacher);
        register(admin);
    }
    
//    �������ͬʱ�ܽ�����ʦ��ѧ��������Ա����ͬ���͵Ĳ�ͬ��̬�Ķ���
    public static void register(Person person){
        person.show();
    }
}
