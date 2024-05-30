package com.study.java_study.ch10_추상화01;

public class Animal {
    String name;
    private int age;

    public Animal() {
        System.out.println("동물 객체 생성");
    }

    //super() : 부모 객체 생성자 호출
    //super : 부모 주소

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void move() {
        System.out.println("동물이 움직입니다.");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
