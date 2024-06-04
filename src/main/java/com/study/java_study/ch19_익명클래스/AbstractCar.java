package com.study.java_study.ch19_익명클래스;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public abstract class AbstractCar {
    //@Getter => model에만 getter 생성
    private String model;
    private String color;

    public abstract void createCar();
    public abstract void showCar();

}
