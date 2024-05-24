package com.study.java_study.ch04_제어;

public class 조건문02 {
    public static void main(String[] args) {
        String text = new String(""); //새로운 객체 생성, 객체의 주소 대입
        String name = "박현주"; //값의 자료형 String , ""도 리터럴, 주소값 바로 대입
        String phone = "1111"; // 값의 자료형 null

        StringUtils stringUtils = new StringUtils();

        if(name == "박현주") {
            System.out.println("같다");
        }
        if(stringUtils.isEmpty(name)) {
            System.out.println("name이 비어있습니다.");
            return;  //함수 종료, void일 때만 값 없어도됨
        }

        if(stringUtils.isEmpty(phone)) {
            System.out.println("phone이 비어있습니다.");
            return;
        }

        if(stringUtils.isEmpty(text)) {
            System.out.println("text이 비어있습니다.");
            return;
        }
    }
}
