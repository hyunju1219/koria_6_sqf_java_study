package com.study.java_study.ch17_컬렉션;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StringArrayListMain {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        ArrayList<String> strList = new ArrayList<>();
        strList.add("test1");

        //배열 <-> 리스트
        List<String> list = Arrays.asList(strArray);

        ArrayList<String> list2 = new ArrayList<>(); //asList는 List 타입으로 반환
        list2.addAll(list);
        String[] strArray2 = strList.toArray(new String[strList.size()]);

        //리스트 값 조회
        System.out.println(strList);
        System.out.println(Arrays.toString(strArray2));

        //contains 포함 조회
        System.out.println(strList.contains("test1"));

        //리스트 바로 생성
        List<Integer> nums = List.of(1,2,3,4,5);
        //nums.add(10); //.of 는 수정할 수 없다.
        System.out.println(nums);

        //제거
        strList.add("박현주1");
        strList.add("박현주2");
        strList.add("박현주3");
        strList.add("박현주4");
        System.out.println(strList);
        System.out.println(strList.remove("test2"));
        System.out.println(strList);
        System.out.println(strList.remove(1));
        System.out.println(strList);
        //removeAll은 ArrayList에만 사용가능
        ArrayList<Integer> nums3 = new ArrayList<>();
        nums3.addAll(nums);
        System.out.println(nums3);
        System.out.println(nums3.removeAll(List.of(1,3,5)));
        System.out.println(nums3);

        //수정
        nums3.set(0, 10);
        System.out.println(nums3);
        nums3.addAll(List.of(1,2,3));
        System.out.println(nums3);

        //반복
        for(int i = 0; i < nums3.size(); i++) {
            System.out.println(nums3.get(i));
        }

        System.out.println();
        for(Integer num : nums3) {
            System.out.println(num);
        }
        System.out.println();
        //iterator객체로 변경
        Iterator<Integer> ir = nums3.iterator();
        while (ir.hasNext()) {
            System.out.println(ir.next());
        }

    }
}
