package com.study.java_study.ch06_배열;

import java.util.Scanner;

public class BookArrayService {
    public static void main(String[] args) {
        BookArrayUtils bookArrayUtils = new BookArrayUtils();
        Scanner scanner = new Scanner(System.in);
        String[] books = new String[0];
        boolean isRun = true;

        while (isRun) {
            System.out.println("[도서관리 프로그램]");
            System.out.println("1. 등록");
            System.out.println("2. 수정");
            System.out.println("3. 삭제");
            System.out.println("4. 도서 찾기");
            System.out.println("5. 전체 조회");
            System.out.println("q. 프로그램 종료");
            System.out.print("메뉴 선택 : ");

            String selecteMenu = scanner.nextLine();
            String[] newBooks = null;
            String findBook;
            int findIndex = -1;

            switch (selecteMenu) {
                case "1":
                    System.out.println("[도서 등록]");
                    System.out.print("등록할 도서 : ");
                    findBook = scanner.nextLine();
                    newBooks = new String[books.length + 1];
                    for(int i = 0; i < books.length; i++) {
                        newBooks[i] = books[i];
                    }
                    newBooks[newBooks.length - 1] = findBook;
                    books = newBooks;
                    break;
                case "2":
                    System.out.println("[도서 수정]");
                    System.out.println("수정할 도서 : ");
                    findBook = scanner.nextLine();
                    findIndex = bookArrayUtils.findIndexbyBook(books, findBook);
                    if(findIndex == -1) {
                        System.out.println("도서가 존재하지 않습니다.");
                        break;
                    }
                    System.out.print("새 도서 : ");
                    books[findIndex] = scanner.nextLine();
                    System.out.println("수정 완료");
                    break;
                case "3":
                    System.out.println("[도서 삭제]");
                    System.out.print("삭제할 도서 : ");
                    findBook = scanner.nextLine();
                    findIndex = bookArrayUtils.findIndexbyBook(books, findBook);
                    if(findIndex == -1) {
                        System.out.println("도서가 존재하지 않습니다.");
                        break;
                    }
                    newBooks = new String[books.length - 1];
                    for(int i = 0; i < newBooks.length; i++) {
                        if(i < findIndex) {
                            newBooks[i] = books[i];
                            continue;
                        }
                        newBooks[i] = books[i + 1];
                    }
                    System.out.println(findBook + "은(는) 삭제되었습니다.");
                    books = newBooks;
                    break;
                case "4":
                    System.out.println("[도서 찾기]");
                    System.out.println("찾을 도서 : ");
                    findBook = scanner.nextLine();
                    findIndex = bookArrayUtils.findIndexbyBook(books, findBook);
                    if(findIndex == -1) {
                        System.out.println(findBook + "은(는) 존재하지 않습니다.");
                        break;
                    }
                    System.out.println(books[findIndex] + "은(는) 등록된 도서입니다.");
                    break;
                case "5":
                    System.out.println("[전체 조회]");
                    for(int i = 0; i < books.length; i++) {
                        System.out.println("index[" + i + "]: " + books[i]);
                    }
                    break;
                case "q":
                    isRun = false;
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("다시 선택하세요");
            }
        }
    }
}
