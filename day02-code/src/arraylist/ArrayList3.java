package arraylist;

import java.util.ArrayList;

public class ArrayList3 {
    public static void main(String[] args) {
        /* 定义一个集合，存入三个用户对象
        * 用户属性为id，username，password
        * 要求定义一个方法，按照id查找用户信息
        * 如果存在返回ture
        * 不存在返回false */
    
        ArrayList<User> arrayList = new ArrayList<>();
        arrayList.add(new User("001", "aa", "123456"));
        arrayList.add(new User("002", "bb", "456789"));
        arrayList.add(new User("003", "cc", "789123"));
    
        String targetID = "0010";
        System.out.println(isExist(targetID,arrayList));
    }
    
//    根据输入的ID判断是否存在此用户
    public static boolean isExist(String ID,ArrayList<User> arrayList){
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getID().equals(ID)) {
                return true;
            }
        }
        return false;
    }
}
