package com.study.java_study.클래스04_복습;

public class CarMain {
    public static void main(String[] args) {
        CarService carService = new CarService();
        System.out.println("프로그램을 시작합니다.");
        while (carService.Run()) {}
        System.out.println("프로그램을 종료합니다.");
    }
}
