package com.study.java_study.클래스04_복습;

public class CarRepository {
    private int carCode;
    private CarEntity[] cars;

    public CarRepository() {
        cars = new CarEntity[0];
    }

    public int autoCarCode() {
        return ++carCode;
    }
    private void extendCars() {
        CarEntity[] newCars = new CarEntity[cars.length +  1];
        for(int i = 0; i < cars.length; i++) {
            newCars[i] = cars[i];
        }
        cars = newCars;
    }

    private int lastIndex(){
        return cars.length - 1;
    }

    public void saveCar(CarEntity car) {
       extendCars();
       cars[lastIndex()] = car;
    }

//    public CarEntity findCarByCarId(int carId) {
//        for(CarEntity car : cars) {
//            if(car.getCarCode() == carId) {
//                return car;
//            }
//        }
//        return null;
//    }

    public CarEntity findCarByCarName(String name) {
        for(CarEntity car : cars) {
            if(car.getCarName().equals(name)) {
                return car;
            }
        }
        return null;
    }

//    private int searchArraySize(int option, String searchText) {
//        int index = 0;
//        switch (option) {
//            case 1: //통합
//                for(CarEntity car : cars) {
//                    if(car.getCarName().contains(searchText)
//                            ||car.getCarColor().contains(searchText)
//                            ||car.getCarBrand().contains(searchText)) {
//                        index++;
//                    }
//                }
//                break;
//            case 2: //이름
//                for(CarEntity car : cars) {
//                    if(car.getCarName().contains(searchText)) {
//                        index++;
//                    }
//                }
//                break;
//            case 3: //색상
//                for(CarEntity car : cars) {
//                    if(car.getCarColor().contains(searchText)) {
//                        index++;
//                    }
//                }
//                break;
//            case 4: //브랜드
//                for(CarEntity car : cars) {
//                    if(car.getCarBrand().contains(searchText)) {
//                        index++;
//                    }
//                }
//                break;
//        }
//        return index;
//    }
//
//    public CarEntity[] findSearch(int option, String searchText){
//        CarEntity[] findCars = new CarEntity[searchArraySize(option, searchText)];
//        int i = 0;
//        switch (option) {
//            case 1: //통합
//                for(CarEntity car : cars) {
//                    if(car.getCarName().contains(searchText)
//                            ||car.getCarColor().contains(searchText)
//                            ||car.getCarBrand().contains(searchText)) {
//                        findCars[i++] = car;
//                    }
//                }
//                break;
//            case 2: //이름
//                for(CarEntity car : cars) {
//                    if(car.getCarName().contains(searchText)) {
//                        findCars[i++] = car;
//                    }
//                }
//                break;
//            case 3: //색상
//                for(CarEntity car : cars) {
//                    if(car.getCarColor().contains(searchText)) {
//                        findCars[i++] = car;
//                    }
//                }
//                break;
//            case 4: //브랜드
//                for(CarEntity car : cars) {
//                    if(car.getCarBrand().contains(searchText)) {
//                        findCars[i++] = car;
//                    }
//                }
//                break;
//        }
//        return findCars;
//    }
//
//    public void deleteCars(int deleteIndex) {
//        CarEntity[] newCars = new CarEntity[cars.length - 1];
//        for(int i = 0; i < cars.length; i++) {
//            if(i < findDeleteCarIndex(deleteIndex)) {
//                newCars[i] = cars[i];
//                continue;
//            }
//            newCars[i] = cars[i + 1];
//        }
//    }
//
//    private int findDeleteCarIndex(int deleteCarId) {
//        for(int i = 0; i < cars.length; i++) {
//            if(cars[i].getCarCode() == deleteCarId) {
//                return i;
//            }
//        }
//        return -1;
    }





