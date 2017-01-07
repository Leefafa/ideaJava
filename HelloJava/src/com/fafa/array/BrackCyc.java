package com.fafa.array;

/**
 * 中断循环
 * 当整数的最大值超出范围时，数值会被截取，绕回到整数类型的最小值，
 * 所以在进行条件判断涉及取值边界时，要考虑这个因素
 * Created by Stark on 2017/1/7 0007.
 */
public class BrackCyc {
    public static void main(String[] args) {
        System.out.println("\n-------------中断单层循环的例子：------------------------------");
        //创建数组
        String[] array = new String[]{"白鹭", "丹顶鹤", "黄鹂", "鹦鹉", "乌鸦", "喜鹊", "老鹰", "布谷鸟", "老鹰", "灰文鸟", "老鹰", "百灵鸟"};
        System.out.println("在你发现一只老鹰之前，告诉我都有什么鸟。");
        for (String string : array) {
            if (string.equals("老鹰")) {
                break;
            }
            System.out.println("有：" + string + "       ");
        }
        System.out.println("\n\n-------------中断双层循环的例子------------");
        //创建成绩数组
        int[][] myScore = new int[][]{{67, 78, 62, 22, 66}, {55, 68, 78, 95, 44}, {95, 97, 92, 93, 81}};
        System.out.println("宝宝这次的考试成绩:\n数学\t语文\t英语\t美术\t历史");
        No1:
        for (int[] is : myScore) {
            for (int i : is) {
                System.out.print(i + "\t\t");
                if (i < 60) {
                    System.out.println("\n 等等，" + i + "分的是什么？这个为什么不及格？");
                    break No1;
                }
            }
            System.out.println();
        }
    }
}
