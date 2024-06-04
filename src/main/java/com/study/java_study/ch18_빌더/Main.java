package com.study.java_study.ch18_빌더;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //내부클래스
        A a = new A();
        A.B b = a.new B();

        a.test();
        b.print();

        //클래스가 static인 경우
        A.C c = new A.C();
        c.show();

        //메서드가 static (내부클래스가 static이 아닌 경우 메소드 static 사용 불가)
        A.C.show2();



    }
}
