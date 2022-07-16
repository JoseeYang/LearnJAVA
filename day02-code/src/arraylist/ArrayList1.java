package arraylist;

import java.util.ArrayList;

public class ArrayList1 {
    /* 集合和数组：
    * 数组可以存基本数据类型和引用数据类型
    * 集合只能存引用数据类型，要存基本数据类型要把他们变成对应的包装类
    * 集合构造方法：
    *ArrayList<E> arrayList = new ArrayList<>()
    * 成员方法：
    * boolean add(E e)添加元素，返回是否添加成功
    * boolean remove(E e)删除元素，返回是否删除成功
    * E remove(int index)删除指定索引的元素，返回该元素
    * E set(int index,E e)修改指定索引的元素，返回该元素
    * E get(int index)获取指定索引的元素
    * int size() 集合的长度 */
    
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("666");
        System.out.println(arrayList);
    }
}
