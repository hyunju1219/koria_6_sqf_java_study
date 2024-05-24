package com.study.java_study.ch06_배열;

import java.util.Scanner;

public class ArrayServiceCopy {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[0];
        ArrayService arrayService = new ArrayService();
        NamesManagement namesManagement = new NamesManagement();

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
                    System.out.print("등록할 이름 : ");
                    namesManagement.add(scanner.nextLine());
                    System.out.println("등록 완료");
                    break;
                case "2":
                    System.out.println("[이름 수정]");
                    System.out.print("이름 검색 : ");
                    findName = scanner.nextLine();
                    if(namesManagement.isFind(findName)) {
                        System.out.println("이름이 존재하지 않습니다.");
                        break;
                    }
                    System.out.print("수정할 이름 : ");
                    namesManagement.update(findName, scanner.nextLine());

                    break;
                case "3":
                    System.out.println("[이름 삭제]");
                    System.out.print("삭제할 이름 : ");
                    findName = scanner.nextLine();
                    if(!arrayService.isFind(names, findName)) {
                        System.out.println("이름이 존재하지 않습니다.");
                        break;
                    }
                    newNames= new String[names.length - 1];
                    int index = 0;
                    for(String i : names) {
                        if(!findName.equals(i)) {
                            newNames[index] = i;
                            index++;
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

}

class NamesManagement {
    String[] names = new String[0];
    String[] newNames;
    String findName;

    public boolean isFind(String name){
        for(String i : names) {
            if(name.equals(i)) {
                return true;
            }
        }
        return false;
    }

    public void add(String name) {
        newNames = new String[names.length + 1];
        for (int i = 0; i < names.length; i++) {
            newNames[i] = names[i];
        }
        names = newNames;
        names[names.length - 1] = name;
    }

    public void update(String name, String updateName) {
        for(int i = 0; i < names.length; i++) {
            if(name.equals(names[i])) {
                names[i] = updateName;
                break;
            }
        }
    }




}
