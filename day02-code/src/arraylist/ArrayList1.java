package arraylist;

import java.util.ArrayList;

public class ArrayList1 {
    /* ���Ϻ����飺
    * ������Դ�����������ͺ�������������
    * ����ֻ�ܴ������������ͣ�Ҫ�������������Ҫ�����Ǳ�ɶ�Ӧ�İ�װ��
    * ���Ϲ��췽����
    *ArrayList<E> arrayList = new ArrayList<>()
    * ��Ա������
    * boolean add(E e)���Ԫ�أ������Ƿ���ӳɹ�
    * boolean remove(E e)ɾ��Ԫ�أ������Ƿ�ɾ���ɹ�
    * E remove(int index)ɾ��ָ��������Ԫ�أ����ظ�Ԫ��
    * E set(int index,E e)�޸�ָ��������Ԫ�أ����ظ�Ԫ��
    * E get(int index)��ȡָ��������Ԫ��
    * int size() ���ϵĳ��� */
    
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("666");
        System.out.println(arrayList);
    }
}
