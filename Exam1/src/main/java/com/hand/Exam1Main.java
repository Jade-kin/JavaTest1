package com.hand;

import java.util.ArrayList;
import java.util.List;

/**
 * 输出101-200之间的素数
 */
public class Exam1Main {

    static int count = 0; //素数的个数
    static List<Integer> list = new ArrayList<Integer>();
    public static void main(String[] args) {

        for (int i = 101; i <= 200; i++) {
            boolean flag = true; // false 不是 质数，true是质数
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                list.add(i);
                count++;
            }
        }
        System.out.println("101-200之间总共有"+count+"个素数，分别是："+list);
    }
}