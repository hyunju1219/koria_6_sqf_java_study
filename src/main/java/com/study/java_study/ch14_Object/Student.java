package com.study.java_study.ch14_Object;

import java.util.Objects;

public class Student {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //getter/setter


    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj.getClass() == this.getClass()) {
            Student student = (Student) obj; //업캐스팅되어 들어왔기 때문에 다시 다운캐스팅해줌
            return Objects.equals(student.name, this.name) && Objects.equals(student.age, age);
        }

        return false;
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age); //값만가지고 만듦, 클래스비교x(원래는 메모리 주소 비교)
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
