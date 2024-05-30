package com.study.java_study.ch01_변수와_자료형;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        Map<String, Integer> map = new HashMap<>();
        String answer = "";
        Integer a = 0;
        for(String name : participant) {
            if(map.containsKey(name)) {
                a = map.get(name) + 1;
                map.put(name, a);
                continue;
            }
            map.put(name,1);
        }

        for(String name : completion) {
            if(map.keySet().contains(name)) {
                a =map.get(name) + 1;
                map.replace(name, a);
            }
        }

        System.out.println(map);
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1) {
                answer = entry.getKey();
            }
        }
        System.out.println(answer);
    }
}

