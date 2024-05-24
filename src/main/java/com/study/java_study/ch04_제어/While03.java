package com.study.java_study.ch04_제어;

import java.util.Scanner;

public class While03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean isRun = true;

        System.out.println("프로그램 시작");

        String name = null;
        String phone = null;
        User[] user = new User[2];

        while(isRun) {
            System.out.println("[메인 메뉴]");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 조회");
            System.out.println("3. 회원 탈퇴");
            System.out.println("q. 프로그램 종료");

            System.out.print("메뉴 선택 : ");
            String selectedMenu = scanner.nextLine();


            switch (selectedMenu) {
                case "1":
                    System.out.println("회원 등록으로 들어오셨습니다.");
                    System.out.print("이름 : ");
                    name = scanner.nextLine();
                    System.out.print("연락처 : ");
                    phone = scanner.nextLine();
                    user[0] = new User(name, phone);

                    System.out.println("회원 정보를 등록했습니다.");
                    break;
                case "2":
                    System.out.println("회원 조회로 들어오셨습니다.");
                    boolean isRunMenu2 = true;
                    while(isRunMenu2) {
                        System.out.println("[회원 조회]");
                        System.out.println("1. 회원 번호로 조회");
                        System.out.println("2. 회원 이름으로 조회");
                        System.out.println("b. 뒤로가기");
                        System.out.print("메뉴 선택 : ");
                        selectedMenu = scanner.nextLine();
                        switch (selectedMenu) {
                            case "1":
                                System.out.println("회원 번호로 조회합니다.");
                                break;
                            case "2":
                                System.out.println("회원 이름으로 조회합니다.");
                                name = scanner.nextLine();
                                if(name.equals(user[0].name)){
                                    System.out.println("이름 : " + user[0].name);
                                    System.out.println("연락처 : " + user[0].phone);
                                }
                                break;
                            case "b":
                                System.out.println("메인 메뉴로 이동합니다.");
                                isRunMenu2 = false;
                                break;
                            case "q":
                                System.out.println("프로그램을 종료합니다.");
                                isRun = false;
                                isRunMenu2 = false;
                                break;
                            default:
                                System.out.println("잘못된 입력입니다. 다시 입력하세요");
                        }
                        System.out.println();
                    }
                    break;
                case "3":
                    System.out.println("회원 탈퇴로 들어오셨습니다.");
                    break;
                case "q":
                    System.out.println("프로그램을 종료합니다.");
                    isRun = false;
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력하세요");
            }
            System.out.println();
        }


        System.out.println("프로그램 종료");
    }
}
