package com.study.java_study.클래스04_복습;

import java.util.Scanner;

public class CarService {
    Scanner scanner;
    CarEntity carEntity;

    public CarService() {
        scanner = new Scanner(System.in);
    }

    public void registerCar() {
        System.out.println("[자동차 등록]");
        System.out.println("자동차 아이디를 입력하세요");
        int carId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("자동차명을 입력하세요");
        String carName = scanner.nextLine();
        System.out.println("색상명을 입력하세요");
        String carCarColor = scanner.nextLine();

        carEntity = new CarEntity(carId, carName, carCarColor);

    }

    public void checkCar() {
        System.out.println("[자동차 조회]");
        System.out.println("Id : " + carEntity.getCarId());
        System.out.println("Name : " + carEntity.getCarName());
        System.out.println("Color : " + carEntity.getCarColor());
    }
}

//    private void search() {
//        System.out.println("[자동차 검색]");
//        System.out.println("1. 통합검색");
//        System.out.println("2. 자동차명 검색");
//        System.out.println("3. 색상명 검색");
//        System.out.println("4. 브랜드명 검색");
//        System.out.print("옵션선택 : ");
//        int option = scanner.nextInt();
//        scanner.nextLine();
//        System.out.print("검색할 단어 : ");
//        String searchText = scanner.nextLine();
//        System.out.println("검색결과");
//        CarEntity[] carEntities = carRepository.findSearch(option, searchText);
//        if(carEntities.length == 0) {
//            System.out.println("검색 결과 없음");
//            return;
//        }
//        for(CarEntity car : carEntities) {
//            System.out.println(car.toString());
//        }
//    }
//
//    private void deleteCar() {
//        System.out.println("[자동차 삭제]");
//        search();
//        System.out.print("삭제할 번호 :");
//        int delCarId = scanner.nextInt();
//        scanner.nextLine();
//        CarEntity car = carRepository.findCarByCarId(delCarId);
//        if(car == null){
//            System.out.println("번호가 존재하지 않습니다.");
//            return;
//        }
//        carRepository.deleteCars(delCarId);
//    }
//
//    private void modify() {
//
//    }
//
//
//}
