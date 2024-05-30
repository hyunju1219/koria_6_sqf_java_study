package com.study.java_study.ch13_추상화04;

public class ClassA1 extends ClassA{

    @Override
    public void print(InterfaceA interfaceA) { // print가 interfaceA를 의존한다.
        System.out.println("A1 클래스에서 print 호출");
        interfaceA.test();
    }
}
