package com.fafa.simpletest;

import java.util.Scanner;

/**
 * 简单的验证
 * Created by Stark on 2017/1/6 0006.
 */
public class CheckLogin {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入登录用户名：");
        String username=scan.nextLine();
        System.out.println("请输入登录密码：");
        String password=scan.nextLine();
        if (!username.equals("mr")){
            System.out.println("用户名非法！");
        }else if (!password.equals("mrsoft")){
            System.out.println("登录密码错误!");
        }else{
            System.out.println("登录成功！");
        }
    }
}
