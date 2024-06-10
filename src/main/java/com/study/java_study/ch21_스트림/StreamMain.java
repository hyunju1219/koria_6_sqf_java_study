package com.study.java_study.ch21_스트림;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class StreamMain {
    public static void main(String[] args) {
        /*
            스트림 : 반복을 위해 사용, 새로운 스트림 생성, 필터링 스트림 생성, 정렬 스트림 생성 => 가공 절차
             생성(사용) 절차
             1. 배열 생성 -> 스트림으로 변환
             2. List 생성 -> 스트림으로 변환
             3. generate 메소드 -> 스트림 생성
             4. 범위 지정 -> 스트림 생성
             5. 빌더 -> 스트림 생성

             중간(가공) 절차
             1. map(Function 인터페이스) : 스트림을 변환시켜 새로운 스트림에 담는다
             2. filter(Predicate 인터페이스) : 조건에 맞는 스트림만 새로운 스트림에 담는다.
             3. sorted(Comparator 인터페이스) :숫자, 문자열, 객체 정렬 방법

             최종(결과) 절차
             1. collect -> stream을 list로 변환할 때 사용
             2. 반복자(forEach) -> 반복해서 결과 출력
         */

        //배열 -> 스트림
        Stream<Integer> st1 = stream(new Integer[] {1,2,3,4,5}); //스트림 생성
        //peek은 스트림실행될 때 사용
        //map은 기존 스트림의 값을 반복해서 가져와 새로운 스트림에 담는다
        //담을때마다 결과값 출력
        //collect 리스트로 변환
        List<Integer> numberList = st1.map(n -> n * 2) //가공
                .peek(n -> System.out.println(n)) //가공(기타스트림 메소드) 그냥 출력 역할
                .collect(Collectors.toList()); //최종

        System.out.println();
        numberList.forEach(n -> System.out.println(n));

        //리스트 -> 스트림
        List<Integer> filteringNumberList = numberList.stream()
                .map(n -> n / 2)
                .peek(n -> System.out.println(n))
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(filteringNumberList);

        List<Integer> sortedNumberList = numberList.stream()
                .sorted((o1, o2) -> o2 - o1) // => 숫자 내림차순
                //sorted((o1, o2) -> o1 - o2) => 숫자 오름차순(기본)
                .collect(Collectors.toList());

        System.out.println(sortedNumberList);

        //빌더 -> 스트림
        Stream<String> nameStream = Stream.<String>builder()
                .add("손경태")
                .add("최단비")
                .add("김지현")
                .add("정령우")
                .add("이성민")
                .build();

        //문자열 오름차순
        //nameStream.sorted().forEach(name -> System.out.println(name));
        //문자열 내림차순(해시로 바꿔야함)
        nameStream.sorted((o1, o2) -> Objects.hash(o2) - Objects.hash(o1))
                .forEach(name -> System.out.println(name));

        //stream()을 호출할때마다 새로운 스트림 생성
        //스트림에서 하나씩 빼서 가져옴 -> 이미 sorted한 스트림을 다시 sorted할 수 없음

        List<Phone> phoneList = List.of(
                Phone.builder().number(1).model("아이폰").build(),
                Phone.builder().number(2).model("갤럭시").build(),
                Phone.builder().number(3).model("샤오미").build()
        );

        //map
        phoneList.stream()
                .map(phone -> Phone.builder()
                    .number(phone.getNumber() * 2)
                    .model(phone.getModel())
                    .build())
                .forEach(phone -> System.out.println(phone));


//        phoneList.stream().map(phone -> {
//            phone.setNumber(phone.getNumber() * 2);
//            return phone;
//        });

        //filter
        phoneList.stream()
                .filter(phone -> phone.getNumber() % 2 != 0)
                .forEach(phone -> System.out.println(phone));

        //sorted(객체 정렬 - number(숫자) 기준)
        phoneList.stream()
                .sorted((o1, o2) -> o2.getNumber() - o1.getNumber())
                .forEach(phone -> System.out.println(phone));

        //sorted(객체 정렬 - model(문자열) 기준)
        phoneList.stream()
                .sorted((o1, o2) -> String.CASE_INSENSITIVE_ORDER.compare(o1.getModel(), o2.getModel()))
                .forEach(System.out :: println); //forEach 에서 자동으로 객체를 꺼내 메소드에 대입
    }
}
