package com.study.java_study.ch22_예외;

public class ArrayExceptionMain {

    public static void printArray(Integer[] nums, int length) throws Exception {
        for(int i = 0; i < length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static void main(String[] args) {
        /*
            예외(오류)
            1. 컴파일 오류 -> 프로그램이 실행(메모리에 할당)되기 전에 오류(문법적 오류, 메모리 부족)
            2. 런타임 오류 -> 프로그램이 실행(메모리에 할당)된 후에 오류
         */
        Integer[] nums = new Integer[] {1,2,3,4,5};

        try {
            printArray(nums, 6);
        } catch (Exception e) {
            System.out.println(e.getMessage());// 동기
            e.printStackTrace(); // 비동기
        }
        System.out.println("프로그램 종료");

    }
}
