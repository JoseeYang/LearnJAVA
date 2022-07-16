package arraylist;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        /* 基本数据类型对应的包装类：
        * int   ->  Integer
        * char  ->  Character
        * 其他的都是仅首字母大写 */
    
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        System.out.println(arrayList);
    }
}
