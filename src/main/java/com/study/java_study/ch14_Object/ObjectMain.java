package com.study.java_study.ch14_Object;

import java.util.Objects;

/*
    Object 클래스 (최상위 클래스)
    어떤 자료든 업캐스팅 가능
    모두가 상속받고잇음
 */
public class ObjectMain {
    public static void main(String[] args) {
        Object object = new Object();
        Student student = new Student("박현주", 24);
        Student student1 = new Student("박현주", 24);
        if(student.equals(student1)) {
            System.out.println("true");
        }
        System.out.println(student.hashCode());
        System.out.println(student1.hashCode());

        System.out.println(student.hashCode() == student1.hashCode());
        System.out.println(Objects.hash("박현주"));
        System.out.println(Objects.hash("박현주"));


//        Object[] objects = new Object[3];
//        objects[0] = new Object();
//        objects[1] = "test";
//        objects[2] = new Student("박현주", 24);
//
//        System.out.println(student);
//        String str = "데이터";
//        //println할때만 toString이 자동으로 실행됨
//        System.out.println(str.toString());
//
//        //println이 아니라서 toString 자동 실행x
//        // String 타입에 student를 넣으려면 toString()을 통해 문자열로 변경후 넣기
//        //String studentData = student; = >안됨
//        String studentData = student.toString();
//        System.out.println(studentData);



    }
}
