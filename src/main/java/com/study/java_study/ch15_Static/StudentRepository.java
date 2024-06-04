package com.study.java_study.ch15_Static;

public class StudentRepository {
    private String[] names;

    private static StudentRepository instance; //1. 인스턴스 변수

    private StudentRepository() { //2. 생성자 private
        names = new String[5];
    }

    public static StudentRepository getInstance(){ //3. static 메서드
        if(instance == null) {
            instance = new StudentRepository();
        }
        return instance;
    }

    public void add(String name) {
        for(int i = 0; i < names.length; i++) {
            if(names[i] == null) {
                names[i] = name;
                break;
            }
        }
    }

    public String[] getNames() {
        return names;
    }

}
