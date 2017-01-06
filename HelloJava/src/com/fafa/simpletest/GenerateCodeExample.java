package com.fafa.simpletest;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 异或加密
 * Created by Stark on 2017/1/6 0006.
 */
public class GenerateCodeExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个英文字符串或解密字符串");
        String password = scan.nextLine();     //获取用户输入
        char[] array = password.toCharArray();    //获取字符数组
        for (int i = 0; i < array.length; i++) {    //遍历字符数组
            array[i] = (char) (array[i] ^ 20000);
        }
        System.out.println("加密或解密结果如下:");
        System.err.println(new String(array));//输出秘钥
    }
}
