package com.study.java_study.ch03_함수;

public class FunctionMain03 {
    public static void main(String[] args) {
        Function03 fx = new Function03();
        fx.fx01(1234, "박현주", 24, "0102222222");

        Student student = new Student();
        student.studentCode = 1235;
        student.name = "박현주";
        student.age = 23;
        student.phone = "0101111111";
        fx.fx02(student);
    }
}
