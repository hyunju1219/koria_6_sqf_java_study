package com.study.java_study.ch01_변수와_자료형;

public class TypeStudy {
    public static void main(String[] args) {
        // [일반 자료형]
        //1. 논리
        boolean a = true;
        boolean b = false;

        //2. 정수
        int c = 1000000000;
        long d = 100000000000L;

        //3. 실수
        double e = 3.14;

        //4. 문자
        char f ='가'; //AC00

        //5. 문자열
        String g = "가나";

        System.out.println((char)((int)f + 1)); //형변환

        //형변환 문자 -> 정수 -> 실수
        double num = 3.14;
        System.out.println(num);

        int num2 = (int)num;
        //int num2 = num; -> 오류(다운캐스팅)
        System.out.println(num2);

        double num3 = num2;
        System.out.println(num3);


    }
}
