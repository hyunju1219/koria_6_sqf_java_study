package com.study.java_study.클래스04_복습;

public class CarEntity {
    private int carId;
    private String carName;
    private String carColor;

    public CarEntity() {
    }

    public CarEntity(int carId, String carName, String carColor) {
        this.carId = carId;
        this.carName = carName;
        this.carColor = carColor;
    }

    public CarEntity(int carId, String carName) {
        this.carId = carId;
        this.carName = carName;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }
}
