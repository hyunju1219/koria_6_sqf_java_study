package com.study.java_study.ch08_클래스03;

public class StudentMain {

    public static void main(String[] args) {
        int[] numbers = new int[5];

        Student[] students = new Student[5];
        students[0] = new Student();
        students[1] = new Student(2, "이상원", 25);
        students[2] = new Student(3, "박현준", 26);

        Student[] studentss = new Student[] {
                new Student(11, "박현주", 24),
                new Student(22, "박현주", 24),
                new Student(33, "박현주", 24)
        };

        for(int i = 0; i < students.length; i++) {
            if(students[i] == null) {
                continue;
            }
            System.out.println("학번 : " + students[i].getCode());
            System.out.println("이름 : " + students[i].getName());
            System.out.println("나이 : " + students[i].getAge());
            System.out.println();
        }

        for(int i = 0; i < studentss.length; i++) {
            if(studentss[i] == null) {
                continue;
            }
            System.out.println("학번 : " + studentss[i].getCode());
            System.out.println("이름 : " + studentss[i].getName());
            System.out.println("나이 : " + studentss[i].getAge());
            System.out.println();
        }


    }
}
