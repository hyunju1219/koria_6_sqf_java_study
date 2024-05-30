package com.study.java_study.ch10_추상화01;

public class Tiger extends Animal{
    private int power;

    public Tiger() {
        System.out.println("호랑이 객체 생성");
    }

    public Tiger(String name, int age, int power) {
        super(name, age); //부모 객체 생성시 name과 age를 넘겨줌
        this.power = power;
    }

    //재정의 : 상속 관계에서만 가능
    @Override //@(어노테이션)은 기능잇지만 오버라이드는 기능없음 그냥 재정의햇다고 알려줌(없어도 상관없)
    public void move() {
        System.out.println("호랑이가 네발로 뛰어갑니다.");
        super.move(); //부모의 메서드 호출
    }

    public void hunt() {
        System.out.println("호랑이가 " + power + "의 힘으로 사냥을 합니다. ");
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "power=" + power +
                "} " + super.toString();
    }
}
