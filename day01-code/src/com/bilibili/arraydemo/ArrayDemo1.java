package com.bilibili.arraydemo;

public class ArrayDemo1 {
    public static void main(String[] args) {
        /* ����ĳ�ʼ����Ϊ��̬��ʼ���Ͷ�̬��ʼ��
        * ����ľ�̬��ʼ����
        * ������ʽ���������� [] ������ = new �������� {���ݱ���}
        * ��д��ʽ���������� [] ������ = {���ݱ���}
        *
        * ����Ķ�̬��ʼ����
        * �������� [] ������ = new �������� {���鳤��} */
        
        /* ����������ָ��ͬһ�ڴ�ռ��ʱ�����Ǿ���һ���������������ֶ��ѣ��޸�����һ����ֵ����һ��Ҳ����֮�ı� */
    
        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1;
        System.out.println(arr1[0]);
        System.out.println(arr2[0]);
        
        arr2[0] = 5;
        System.out.println(arr1[0]);
        System.out.println(arr2[0]);
    }
}
