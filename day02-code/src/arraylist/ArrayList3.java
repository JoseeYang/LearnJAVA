package arraylist;

import java.util.ArrayList;

public class ArrayList3 {
    public static void main(String[] args) {
        /* ����һ�����ϣ����������û�����
        * �û�����Ϊid��username��password
        * Ҫ����һ������������id�����û���Ϣ
        * ������ڷ���ture
        * �����ڷ���false */
    
        ArrayList<User> arrayList = new ArrayList<>();
        arrayList.add(new User("001", "aa", "123456"));
        arrayList.add(new User("002", "bb", "456789"));
        arrayList.add(new User("003", "cc", "789123"));
    
        String targetID = "0010";
        System.out.println(isExist(targetID,arrayList));
    }
    
//    ���������ID�ж��Ƿ���ڴ��û�
    public static boolean isExist(String ID,ArrayList<User> arrayList){
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getID().equals(ID)) {
                return true;
            }
        }
        return false;
    }
}
