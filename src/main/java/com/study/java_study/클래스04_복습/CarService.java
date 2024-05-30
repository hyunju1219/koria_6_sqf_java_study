package com.study.java_study.클래스04_복습;

import java.util.Scanner;

public class CarService {
    Scanner scanner;
    CarRepository carRepository;

    public CarService() {
        scanner = new Scanner(System.in);
        carRepository = new CarRepository();
    }

    private String selectMenu() {
        String option = null;
        while (true) {
            System.out.print("옵션선택 : ");
            option = scanner.nextLine();
            if("1234q".contains(option)) {
                return option;
            }
            System.out.println("다시 입력해주세요");
        }
    }

    public boolean Run() {
        System.out.println("[자동차 관리 프로그램]");
        System.out.println("1.자동차 등록");
        System.out.println("2.자동차 검색");
        System.out.println("3.자동차 수정");
        System.out.println("4.자동차 삭제");
        System.out.println("q.프로그램 종료");
        String selectMenu = selectMenu();

        switch (selectMenu) {
            case "q":
                return false;
            case "1":
                registerCar();
                break;
            case "2":
                search();
                break;
            case "3":
                break;
            case "4":
                deleteCar();
                break;
        }
        return true;
    }

    private String validateValue(String title) {
        String value = null;
        while (true) {
            System.out.print(title + "명 입력 : ");
            value = scanner.nextLine();
            if(!value.isBlank()) {
                return value;
            }
            System.out.println("공백입니다. 다시 입력하세요");
        }
    }

    private String duplicateBookName() {
        String carName = null;
        while (true) {
            carName = validateValue("자동차");
            if(carRepository.findCarByCarName(carName) == null) {
                return carName;
            }
            System.out.println("이미 존재하는 자동차입니다. 다시 입력하세요");
        }
    }

    private void registerCar() {
        System.out.println("[자동차 등록]");

        CarEntity saveCar = new CarEntity(carRepository.autoCarCode(),
                duplicateBookName(),
                validateValue("색상"),
                validateValue("브랜드"));

        carRepository.saveCar(saveCar);

    }

    private void search() {
        System.out.println("[자동차 검색]");
        System.out.println("1. 통합검색");
        System.out.println("2. 자동차명 검색");
        System.out.println("3. 색상명 검색");
        System.out.println("4. 브랜드명 검색");
        System.out.print("옵션선택 : ");
        int option = scanner.nextInt();
        scanner.nextLine();
        System.out.print("검색할 단어 : ");
        String searchText = scanner.nextLine();
        System.out.println("검색결과");
        CarEntity[] carEntities = carRepository.findSearch(option, searchText);
        if(carEntities.length == 0) {
            System.out.println("검색 결과 없음");
            return;
        }
        for(CarEntity car : carEntities) {
            System.out.println(car.toString());
        }
    }

    private void deleteCar() {
        System.out.println("[자동차 삭제]");
        search();
        System.out.print("삭제할 번호 :");
        int delCarId = scanner.nextInt();
        scanner.nextLine();
        CarEntity car = carRepository.findCarByCarId(delCarId);
        if(car == null){
            System.out.println("번호가 존재하지 않습니다.");
            return;
        }
        carRepository.deleteCars(delCarId);
    }

    private void modify() {

    }


}
