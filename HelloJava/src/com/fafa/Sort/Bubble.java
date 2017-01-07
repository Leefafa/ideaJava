package com.fafa.Sort;

/**
 * 冒泡排序
 * Created by Stark on 2017/1/7 0007.
 */
public class Bubble {
    public static void main(String[] args) {
        int a[]={10,23,11,56,45,26,59,28,84,79};
        int i,temp;
        System.out.println("初始序列数组为:");
        for (i = 0; i < 10; i++) {
            System.out.print(a[i]+" ");
        }
        for (i = 0; i < 10; i++) {
            for (int j=i+1;j<10;j++){
                if (a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("\n"+"排序好的数组为：");
        for (i = 0; i <10; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
