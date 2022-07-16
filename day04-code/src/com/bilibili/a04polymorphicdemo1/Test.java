package com.bilibili.a04polymorphicdemo1;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("学生");
        student.setAge(15);
    
        Teacher teacher = new Teacher();
        teacher.setName("老师");
        teacher.setAge(22);
    
        Admin admin = new Admin();
        admin.setName("管理员");
        admin.setAge(28);
        
        register(student);
        register(teacher);
        register(admin);
    }
    
//    这个方法同时能接受老师，学生，管理员三种同类型的不同形态的对象
    public static void register(Person person){
        person.show();
    }
}
