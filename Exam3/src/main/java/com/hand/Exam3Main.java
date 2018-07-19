package com.hand;

import java.util.*;

public class Exam3Main {
    public static void main( String[] args ) {

        Random random = new Random();
		List<Integer> list = new ArrayList<Integer>();
        random.ints(0,100)
                .limit(50).sorted().forEach((i)-> list.add(i));
        
        Map<Integer,List> listMap = new HashMap<Integer,List>();
        for (int i = 0;i < 50;i++){
            list.add(random.nextInt(100));
        }

        listMap = listToMap(list);
        System.out.println("得到的Map："+listMap);
    }

    public static Map<Integer,List> listToMap(List<Integer> list){

        Map<Integer,List> map = new HashMap<Integer,List>();

        for(Integer i : list){
            boolean flag = true;
            int key = i / 10;
            for(Map.Entry entry : map.entrySet()){
                int temp = (int) entry.getKey();
                if(temp == key){
                    List listMap = map.get(entry.getKey());
                    if(!listMap.contains(new Integer(i))){
                        listMap.add(i);
                    }
                    flag = false;
                }
            }
            if(flag == true){
                List<Integer> list1 = new ArrayList();
                list1.add(i);
                map.put(key,list1);
            }
        }

        return map;
    }

    public static List<Integer> listSort(List<Integer> list){
        for (int i = 0; i < list .size(); i++){
            for (int j = list .size()-1; j > i; j--) {
                if (list.get(i) > list.get(j)){
                    list.set(j, list.get(j));
                    list.set(j-1, list.get(i) );
                }
            }
        }
        return list;
    }
}
