package com.careerit.cj.HashMapExamples;

import java.util.HashMap;

public class Example1 {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1001, "Krish");
        map.put(1002, "Manoj");
        map.put(1003, "Charan");
        map.put(1004, "Manoj");
        map.put(1005, "Manoj");
        for(Integer key:map.keySet()) {
        	System.out.println(key+" : "+map.get(key));
        }
        map.get(1001);
        map.get(1002);
        System.out.println(map.get(1001));
        System.out.println(map.get(1002));
        map.remove(1001);
        map.remove(1005);
        System.out.println(map);
        map.clear();
        System.out.println(map);
        map.put(1001, "Lakshmi");
        map.put(1002, "Venkat");
        map.put(1003, "Lalitha");
        System.out.println(map);

    }
}
