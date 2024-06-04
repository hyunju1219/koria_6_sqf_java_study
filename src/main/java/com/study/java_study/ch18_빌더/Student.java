package com.study.java_study.ch18_빌더;

public class Student {
    private int studentCode;
    private String name;
    private int age;

    public Student() {
    }

    //2. 상위 클래스의 생성자
    public Student(int studentCode, String name, int age) {
        this.studentCode = studentCode;
        this.name = name;
        this.age = age;
    }

    //3. StudentEntityBuilder를 생성하는 static 메서드
    public static StudentEntityBuilder builder() {
        Student.StudentEntityBuilder studentEntityBuilder = new Student().new StudentEntityBuilder();
        return studentEntityBuilder; // StudentEntityBuilder 생성
    }

    //1. StudentEntityBuilder 클래스 작성(내부)
    public class StudentEntityBuilder {
        private int studentCode;
        private String name;
        private int age;

        //4. build 메서드 작성
        public Student build() {
            return new Student(studentCode, name, age); //Student 생성하고 값넣어서 리턴
        }

        //5. 자신의 주소를 리턴하는 setter 작성(메소드명은 변수명과 동일)
        public StudentEntityBuilder studentCode(int studentCode) {
            this.studentCode = studentCode;
            return this;
        }

        public StudentEntityBuilder name(String name) {
            this.name = name;
            return this;
        }

        public StudentEntityBuilder age(int age) {
            this.age = age;
            return this;
        }
    }
}
