package com.study.java_study.ch09_클래스04;

import com.study.java_study.클래스04_복습.CarEntity;

// 저장소 -> CRUD : 배열존재
public class BookRepository {
    private int bookId;
    private BookEntity[] books;

    public BookRepository() {
        books = new BookEntity[0]; // 생성자 안에 넣는 이유 : 저장소가 생성될 떄 배열 같이 생성하기 위함
    }

    public int autoIncrementBookId() {
        return ++bookId;
    }

    private void extendBooks() {
        //기존 배열보다 크기가 하나 더 큰 새로운 배열 생성
        BookEntity[] newBooks = new BookEntity[books.length + 1];
        //기존 배열의 정보를 새로운 배열로 옮긴다. 이때 마지막 인덱스의 값은 빈값이다.
        for(int i = 0; i < books.length; i++) {
            newBooks[i] = books[i];
        }
        //기존의 배열의 주소가 들어있는 books 변수에 새로운 배열의 주소를 대입한다.
        books = newBooks; // 마지막은 비어있음
    }

    private int getLastIndex() {
        return books.length - 1;
    }

    public void saveBook(BookEntity book) {
        //배열 확장
        extendBooks();
        //새로운 배열의 비어있는 마지막 인덱스에 매개변수로 받아온 book 객체를 대입한다.
        books[getLastIndex()] = book;
    }

    //단건조회 : 하나만 조회
    public BookEntity findBookByBookId(int bookId) {
        BookEntity findBook = null;
        //선형탐색
        for(BookEntity book : books) {
            if(book.getBookId() == bookId) {
                findBook = book;
                break;
            }
        }
        return findBook;
    }
    //단건조회 : 하나만 조회
    public BookEntity findBookByBookName(String bookName) {
        BookEntity findBook = null;
        for(BookEntity book : books) {
            if(book.getBookName().equals(bookName)) {
                findBook = book;
                break;
            }
        }
        return findBook; //일치하는게 없으면 null 반환
    }

    private int getNewArraySize(int option, String searchText) {
        int newArraySize =0;

        switch (option) {
            case 1: //통합검색
                for(BookEntity book : books) {
                    if (book.getBookName().contains(searchText)
                            || book.getAuthor().contains(searchText)
                            || book.getPublisher().contains(searchText)) {
                        newArraySize++;
                    }
                }
                break;
            case 2: //도서명검색
                for(BookEntity book : books) {
                    if (book.getBookName().contains(searchText)) {
                        newArraySize++;
                    }
                }
                break;
            case 3: //저자명검색
                for(BookEntity book : books) {
                    if (book.getAuthor().contains(searchText)) {
                        newArraySize++;
                    }
                }
                break;
            case 4: //출판사명검색
                for(BookEntity book : books) {
                    if (book.getPublisher().contains(searchText)) {
                        newArraySize++;
                    }
                }
                break;
        }
        return newArraySize;
    }

    //다건조회 : 여러개 조회
    public BookEntity[] searchBooks(int option, String searchText) {

        int newArraySize = getNewArraySize(option, searchText);

        BookEntity[] searchBooks = new BookEntity[newArraySize];

        int i =0;
        switch (option) {
            case 1: //통합검색
                for(BookEntity book : books) {
                    if (book.getBookName().contains(searchText)
                            || book.getAuthor().contains(searchText)
                            || book.getPublisher().contains(searchText)) {
                        searchBooks[i++] = book;
                    }
                }
                break;
            case 2: //도서명검색
                for(BookEntity book : books) {
                    if (book.getBookName().contains(searchText)) {
                        searchBooks[i++] = book;
                    }
                }
                break;
            case 3: //저자명검색
                for(BookEntity book : books) {
                    if (book.getAuthor().contains(searchText)) {
                        searchBooks[i++] = book;
                    }
                }
                break;
            case 4: //출판사명검색
                for(BookEntity book : books) {
                    if (book.getPublisher().contains(searchText)) {
                        searchBooks[i++] = book;
                    }
                }
                break;
        }
        return searchBooks;
    }

    private int IndexOfBookId(int bookId) {
        int findIndex = -1;
        for(int i = 0; i < books.length; i++) {
            if(books[i].getBookId() == bookId) {
                findIndex = i;
                break;
            }
        }
        return findIndex;
    }

    public void deleteBookByBookId(int bookId) {
        BookEntity[] newBooks = new BookEntity[books.length - 1];
        for(int i = 0; i < newBooks.length; i++) {
            if(i < IndexOfBookId(bookId)) {
                newBooks[i] = books[i];
                continue;
            }
            newBooks[i] = books[i + 1];
        }
        books = newBooks;
    }
}