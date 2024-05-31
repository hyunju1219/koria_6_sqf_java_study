package com.study.java_study.클래스04_복습;

public class CarEntity11 {
    private int carCode;
    private String carName;
    private String carColor;

    public CarEntity11() {
    }

    public CarEntity11(int carCode, String carName, String carColor, String carBrand) {
        this.carCode = carCode;
        this.carName = carName;
        this.carColor = carColor;

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


}
