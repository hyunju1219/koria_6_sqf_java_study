package com.study.java_study.ch15_Static;

public class StudentService {
    private static StudentService instance; //static쓰는 이유 : 스태틱이 먼저 생성되고 안붙은건 나중에 생성자쓸 때 생겅되서

    private StudentService() {}

    public static StudentService getInstance(){
        if(instance == null) {
            instance = new StudentService();
        }
        return instance;
    }

    //싱글톤 썻을때
    public void addStudent() {
        StudentRepository.getInstance().add("박현주");
    }

    //싱글톤 안썻을 때
    //매개변수로 StudentRepository studentRepository 동일한 주소 받아서 밑에 코드처럼 add함 => 싱글톤 안쓰면
//    public void addStudent(StudentRepository studentRepository) {
//       StudentRepository studentRepository = new StudentRepository();
//        studentRepository.add("박현준");
//
//    }
    public void getStudentData() {
        String[] names = StudentRepository.getInstance().getNames();
        for(String name : names) {
            System.out.println(name);
        }
        System.out.println();
    }
}
