package com.study.java_study.ch06_배열;

import java.util.Scanner;

public class ArrayService {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[0];
        ArrayService arrayService = new ArrayService();

        boolean isRun = true;
        while(isRun) {
            System.out.println("[이름관리 프로그램]");
            System.out.println("1. 등록");
            System.out.println("2. 수정");
            System.out.println("3. 삭제");
            System.out.println("4. 이름 찾기");
            System.out.println("5. 전체 조회");
            System.out.println("q. 프로그램 종료");
            System.out.print("메뉴 선택 : ");

            String selecteMenu = scanner.nextLine();
            String[] newNames ;
            String findName;

            switch (selecteMenu) {
                case "1":
                    System.out.println("[이름 등록]");
                    newNames = new String[names.length + 1];
                    for(int i = 0; i < names.length; i++) {
                        newNames[i] = names[i];
                    }
                    names = newNames;
                    System.out.print("등록할 이름 : ");
                    names[names.length - 1] = scanner.nextLine();
                    System.out.println("등록 완료");
                    break;
                case "2":
                    System.out.println("[이름 수정]");
                    System.out.print("이름 검색 : ");
                    findName = scanner.nextLine();
                    if(!arrayService.isFind(names, findName)) {
                        System.out.println("이름이 존재하지 않습니다.");
                        break;
                    }
                    for(int i = 0; i < names.length; i++) {
                        if(findName.equals(names[i])) {
                            System.out.print("수정할 이름 : ");
                            names[i] = scanner.nextLine();
                            System.out.println("수정 완료");
                            break;
                        }
                    }
                    break;
                case "3":
                    System.out.println("[이름 삭제]");
                    System.out.print("삭제할 이름 : ");
                    findName = scanner.nextLine();
                    boolean isDelFind = true;
                    int index = 0;
                    for(int i = 0; i < names.length; i++) {
                        if(findName.equals(names[i])) {
                            index = i;
                            isDelFind = false;
                            break;
                        }
                    }
                    if(isDelFind) {
                        System.out.println("이름이 존재하지 않습니다.");
                        break;
                    }
                    newNames= new String[names.length - 1];
                    int cnt = 0;
                    for(int i = 0; i < names.length; i++) {
                        if(i != index) {
                            newNames[cnt] = names[i];
                            cnt++;
                        }
                    }
                    names = newNames;
                    System.out.println("삭제 완료");
                    break;
                case "4":
                    System.out.println("[이름 찾기]");
                    System.out.print("찾을 이름 : ");
                    String result = null;
                    findName = scanner.nextLine();
                    if(!arrayService.isFind(names, findName)) {
                        System.out.println("해당 이름은 존재하지 않는 이름입니다.");
                        break;
                    }
                    System.out.println("해당 이름은 등록된 이름입니다.");
                    break;
                case "5":
                    System.out.println("[전체 조회]");
                    for(int i = 0; i < names.length; i++) {
                        System.out.println("index[" + i + "]: " + names[i]);
                    }
                    break;
                case "q":
                    isRun = false;
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("다시 입력하세요");
            }
            System.out.println();
        }
    }
    public boolean isFind(String[] names, String findName){

        for(String name : names) {
            if(findName.equals(name)) {
                return true;
            }
        }
        return false;
    }
}

