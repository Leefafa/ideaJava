package com.fafa.array;

/**
 * Created by Stark on 2017/1/6 0006.
 */
public class DiamondExample {
    public static void main(String[] args) {
        printHollowRhombus(10);
    }
    public static void printHollowRhombus(int size){
        if (size%2==0){
            size++;                 //计算菱形大小
        }
        for (int i = 0; i < size/2+1; i++) {                //输出左上角位置的空白
            for (int j = size/2+1; j > i+1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i+1; j++) {
                if (j==0||j==2*i){
                    System.out.print("*");                  //输出菱形上半部边缘
                }else{
                    System.out.print(" ");                   //输出菱形上半部空心
                }
            }
            System.out.println("");
        }
        for (int i = size/2+1; i < size; i++) {                //输出左下角位置的空白
            for (int j = 0; j<i-size/2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*size-1-2*i; j++) {
                if (j==0||j==2*(size-i-1)){
                    System.out.print("*");                  //输出菱形下半部边缘
                }else{
                    System.out.print(" ");                   //输出菱形下半部空心
                }
            }
            System.out.println("");
        }
    }
}
