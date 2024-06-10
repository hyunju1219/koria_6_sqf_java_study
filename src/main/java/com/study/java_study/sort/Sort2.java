package com.study.java_study.sort;

import java.util.Arrays;

public class Sort2 {
    public static void main(String[] args) {
        String[] str = new String[] {"3", "30", "34", "5", "9"};
        //Arrays.sort(str);

        Arrays.sort(str, (a,b)->{
           // System.out.println(-(a+b).compareTo(b+a));
            return -(a+b).compareTo(b+a);
        });
        for(String s : str) {
            System.out.println(s);
        }


    }
}
