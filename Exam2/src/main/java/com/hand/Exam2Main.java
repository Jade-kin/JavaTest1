package com.hand;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * 计算个人所得税
 *
 */
public class Exam2Main {

    public static void main( String[] args ) {

        IncomeTax incomeTax = IncomeTax.getIncomeTax();

        Map<String,Integer> salaryMap = new HashMap<String,Integer>();
        salaryMap.put("userA",5000);
        salaryMap.put("userB",10000);
        salaryMap.put("userC",15000);
        salaryMap.put("userD",60000);
        Set<String> keys = salaryMap.keySet();
        for (int i = 0;i<salaryMap.size();i++){
            System.out.println((keys.toArray())[i]+"需要缴纳的税费为："
                    +incomeTax.calculation(salaryMap.get((keys.toArray())[i])));
        }
    }
}
