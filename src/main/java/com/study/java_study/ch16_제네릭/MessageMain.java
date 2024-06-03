package com.study.java_study.ch16_제네릭;

public class MessageMain {
    public static void main(String[] args) {
        //제네릭 와일드 카드 : 기호 -> ?

        Message<?> m1;
        Message<String> m2 = null;
        m1 = new Message<>("10");
        String s = (String) m1.getMessage(); // 다운캐스팅해야함 -> 와일드 카드의 자료형 : Object

        //와일드카드 제약
        Message<? extends String> m3 = new Message<>("10"); //String이나 String을 상속받은 것만 허용, 하행(다운캐스팅필요)
        Message<? super  String> m4 = new Message<>(new Object()); //상행, 자신으로부터 위로, 형제안됨(업캐스팅)

        String s2 = m3.getMessage(); //String을 최상위로 정해서 다운캐스팅 x

    }
}
