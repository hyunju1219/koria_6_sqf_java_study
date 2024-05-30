package com.study.java_study.ch14_Object;

public class TeacherMain {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("박현주", 24);
        Teacher teacher2 = new Teacher("박현주", 24);
        teacher.getAge();
        System.out.println(teacher);
        System.out.println(teacher.hashCode() == teacher2.hashCode());
        System.out.println(teacher.equals(teacher2));
    }
}
