package com.study.java_study.클래스04_복습;

public class CarEntity {
    private int carCode;
    private String carName;
    private String carColor;
    private String carBrand;

    public CarEntity() {
    }

    public CarEntity(int carCode, String carName, String carColor, String carBrand) {
        this.carCode = carCode;
        this.carName = carName;
        this.carColor = carColor;
        this.carBrand = carBrand;
    }

    public int getCarCode() {
        return carCode;
    }

    public void setCarCode(int carCode) {
        this.carCode = carCode;
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

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    @Override
    public String toString() {
        return "CarEntity{" +
                "carCode=" + carCode +
                ", carName='" + carName + '\'' +
                ", carColor='" + carColor + '\'' +
                ", carBrand='" + carBrand + '\'' +
                '}';
    }
}
