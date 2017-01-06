package com.fafa.array;

import java.math.BigDecimal;

/**
 * 计算1+1/2!+1/3!+.....+1/20!
 * Created by Stark on 2017/1/6 0006.
 */
public class BigDecimalExample {
    public static void main(String[] args) {
        BigDecimal sum = new BigDecimal(0.0);     //和
        BigDecimal factorial = new BigDecimal(1.0);   //阶乘项的计算结果
        int i = 1;
        while (i <= 20) {
            sum = sum.add(factorial);             //累加各项阶乘的和
            ++i;
            factorial = factorial.multiply(new BigDecimal(1.0 / i));    //计算阶乘项
        }
        System.out.println("------------------------------------------------------------------------");
        System.out.println("1+1/2!+1/3!+....+1/20!的计算结果为：\n" + sum);
    }
}
