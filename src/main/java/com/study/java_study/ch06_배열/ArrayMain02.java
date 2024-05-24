package com.study.java_study.ch06_배열;

public class ArrayMain02 {
    public static void main(String[] args) {

        //김준일 => 999
        String a = "김준일"; //a = 999
        String b = new String("김준일"); // new로 새로운 주소 200이 생겼고 b는 200을 가리킴, 200안에 999가 들어가 있음
        System.out.println(a);
        System.out.println(b);

        System.out.println(a == "김준일");
        System.out.println(b == "김준일");

        String[] names = new String[2];
        names[0] = "김준일";
        names[1] = new String("김준일");

        String[] names2 = {"김준일", new String("김준일"), null}; // new String[]이 생략된 것

        System.out.println();
        System.out.println(names2[0].equals(names2[1]) );
        System.out.println(names[0] == names2[0]);
        System.out.println(names[1] == names2[1]);
        System.out.println(names == names2); //배열 주소 비교

        System.out.println(new String[2]);
        System.out.println(new String[] {"a", "b"});
        //System.out.println({"a", "b"});
    }
}
