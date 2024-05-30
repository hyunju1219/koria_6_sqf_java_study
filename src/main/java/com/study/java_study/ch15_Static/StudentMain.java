package com.study.java_study.ch15_Static;

/*
    싱글톤 디자인 패턴
    1. 객체를 유일하게 하나만 생성하여 사용하는 기법
    2. 생성자가 private으로 외부에서는 생성할 수 없다.
    객체 하나를 공유해서 쓴다

 */
public class StudentMain {
    public static void main(String[] args) {
        StudentService studentService = StudentService.getInstance();
        StudentService studentService2 = StudentService.getInstance();
        //싱글톤 썻을 때
        studentService.addStudent();
        //StudentRepository.getInstance() 이부분이 공유하는 객체 주소
        StudentRepository.getInstance().add("박현준");
        studentService2.addStudent();
        studentService.getStudentData();

        //싱글톤 안썻을 때
//        StudentRepository studentRepository = new StudentRepository();
////      studentRepository.add("박현준");
//        studentService.addStudent(studentRepository);
//        StudentRepository.getInstance().add("박현준");
//        studentService2.addStudent(studentRepository);
//        studentService.getStudentData();
    }
}
