package com.study.java_study.ch09_클래스04;

import java.util.Scanner;

public class BookService {

    private Scanner scanner;
    private BookRepository bookRepository;

    public BookService() {
        scanner = new Scanner(System.in);
        bookRepository = new BookRepository();
    }

    private String selectMenu() {
        String menus = "1234q";
        String selectMenu = null;
        while (true) {
            System.out.print("메뉴 선택 : ");
            selectMenu = scanner.nextLine();
            if(menus.contains(selectMenu)) {
                break;
            }
            System.out.println("잘못된 입력입니다. 다시 입력하세요");
        }
        return selectMenu;
    }

    public boolean run() {
        boolean isRun = true;
        System.out.println("[도서 관리 프로그램]");
        System.out.println("1. 도서 등록");
        System.out.println("2. 도서 검색");
        System.out.println("3. 도서 수정");
        System.out.println("4. 도서 삭제");
        System.out.println("q. 프로그램 종료");

        String selectedMenu = selectMenu();
        switch (selectedMenu) {
            case "q":
                isRun = false;
                break;
            case "1":
                registerBook();
                break;
            case "2":
                search();
                break;
            case "3":
                modify();
                break;
            case "4":
                remove();
                break;
            default:
                System.out.println("입력 오류");
        }
        System.out.println();

        return isRun;
    }

    private String validateValue(String title) { //입력 공백확인
        String value = null;
        while (true) {
            System.out.print(title + "명 입력 : ");
            value = scanner.nextLine();
            //isEmpty : 띄어쓰기도 문자로 봄, isBlank : 띄어쓰기는 비어있다고 봄 =>문자열에 사용
            if(!value.isBlank()) {
                break;
            }
            System.out.println(title + "은 공백일 수 없습니다. 다시 입력하세요");
        }
        return value;
    }

    private String duplicateBookName() { //중복확인 + 공백확인
        String bookName = null;
        while (true) {
            bookName = validateValue("도서"); //공백확인
            if(bookRepository.findBookByBookName(bookName) == null) { //아직 도서의 이름이 등록되지 않음
                break;
            }
            System.out.println("해당 도서명이 이미 존재합니다. 다시 입력하세요");
        }
        return bookName;
    }

    private void registerBook() {
        System.out.println("[도서 등록]");
        int bookId = bookRepository.autoIncrementBookId();
        String bookName = duplicateBookName();
        String author = validateValue("저자");
        String publisher = validateValue("출판사");

        BookEntity book = new BookEntity(bookId, bookName, author, publisher);
        bookRepository.saveBook(book);
        System.out.println("새로운 도서를 등록하였습니다.");
    }

    private void search() {
        System.out.println("[도서 검색]");
        System.out.println("1.통합검색");
        System.out.println("2.도서명 검색");
        System.out.println("3.저자명 검색");
        System.out.println("4.출판사명 검색");

        System.out.print("옵션 선택 : ");
        int option = scanner.nextInt();
        scanner.nextLine();

        System.out.print("검색어 입력 : ");
        String searchText = scanner.nextLine();
        BookEntity[] searchBooks = bookRepository.searchBooks(option, searchText);

        System.out.println("검색결과");
        if(searchBooks.length == 0) {
            System.out.println("검색 결과가 없습니다.");
            return;
        }
        for(BookEntity book : searchBooks) {
            System.out.println(book.toString());
        }
    }

    private void remove() {
        System.out.println("[도서 삭제]");
        search();
        System.out.print("삭제할 도서번호 입력 : ");
        int removeBookId = scanner.nextInt();
        scanner.nextLine();
        BookEntity book = bookRepository.findBookByBookId(removeBookId);
        if(book == null) {
            System.out.println("해당 도서번호는 존재하지 않습니다.");
            return;
        }
        bookRepository.deleteBookByBookId(removeBookId);
    }

    private void modify() {
        System.out.println("[도서 수정]");
        search();
        System.out.print("수정할 도서 번호 입력 : ");
        int modifyBookId = scanner.nextInt();
        scanner.nextLine();
        BookEntity book = bookRepository.findBookByBookId(modifyBookId); //주소를 가져왔기 때문에 set해도 바뀜
        System.out.print("<<도서 수정 정보 입력>> ");
        for(int i = 0; i < 3; i++) {
            String selected = null;
            switch (i) {
                case 0:
                    System.out.print("도서명을 수정하시겠습니까?(y/n)");
                    selected = scanner.nextLine();
                    //equalsIgnoreCase : 대소문자 구분없이 비교
                    if(selected.equalsIgnoreCase("y")) {
                        book.setBookName(duplicateBookName());
                        break;
                    }
                    break;
                case 1:
                    System.out.print("저자명을 수정하시겠습니까?(y/n)");
                    selected = scanner.nextLine();
                    if(selected.equalsIgnoreCase("y")) {
                        book.setAuthor(validateValue("저자"));
                        break;
                    }
                    break;
                case 2:
                    System.out.print("출판사명을 수정하시겠습니까?(y/n)");
                    selected = scanner.nextLine();
                    if(selected.equalsIgnoreCase("y")) {
                        book.setPublisher(validateValue("출판사"));
                        break;
                    }
                    break;
            }
        }
    }




}
