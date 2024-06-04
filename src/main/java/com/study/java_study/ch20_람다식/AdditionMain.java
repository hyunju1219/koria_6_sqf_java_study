package com.study.java_study.ch20_람다식;

public class AdditionMain {
    public static void main(String[] args) {
        Addition addition = new Addition() {
            @Override
            public int add(int x, int y) {
                return x + y;
            }
        };

        int result = addition.add(10,20);
        System.out.println("결과 : " + result);

        //람다식 : 익명클래스 생성과 정의를 간결하게 표현
        Addition addition2 = (x, y) -> x + y;
        result = addition2.add(10, 20);
        System.out.println("결과2 : " + result);
    }


}
