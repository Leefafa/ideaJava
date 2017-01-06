package com.fafa.array;

/**
 * 九九乘法表
 * Created by Stark on 2017/1/6 0006.
 */
public class MutilplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                //输出计算结果但不换行
                System.out.print(i + "*" + j + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }
}
