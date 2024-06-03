package com.study.java_study.ch16_제네릭;

public class SenderMain {
    public static void main(String[] args) {
        //제네릭 - 일반자료형은 못씀, 객체 자료형만 가능
        //Wrapper 자료형
        // --(언박싱)-->
        // <--(박싱)--
        // Integer - int
        // Boolean - boolean
        // Character - char
        // Double - double
        // Long - long
        // Float - float

        Integer num = new Integer(10); //박싱
        int num2 = num.intValue(); //언박싱

        //자바는 자동 언박싱과 박싱해줌
        Integer num3 = 20; //자동 박싱
        int num4 = num3; //자동 언박싱

        Sender sender1 = new Sender<Integer,String, Double>(10, "test", 3.14); // 생성 -> 메모리할당 시 타입을 결정
       // Sender<Integer,String, Double> sender1 = new Sender<>(10, "test", 3.14);
        Sender sender2 = new Sender<String, String, Integer>("test1", "test2", 10);
        System.out.println(sender1);
        System.out.println(sender2);
        //업캐스팅햇으면 다운캐스팅해서 써야함(Object)
    }
}
