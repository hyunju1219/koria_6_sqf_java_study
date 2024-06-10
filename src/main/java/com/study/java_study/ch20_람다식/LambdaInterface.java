package com.study.java_study.ch20_람다식;

import javax.lang.model.type.IntersectionType;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaInterface {
    public static void main(String[] args) {
        //정의
        Runnable runnable = () -> {
            System.out.println("프로그램 실행");
            System.out.println("프로그램 종료");
        };
        //실행(인터페이스에 정의되어있는 메서드 이름으로 호출)
        runnable.run();

        //제네릭을 지정하지 않은 경우 Object로 지정
        //중괄호와 return은 같이 생략
        Function<String, Integer> fx = s -> Integer.parseInt(s);
        Integer num = fx.andThen(n -> n + 10).apply("10");
        System.out.println("num : " + num);
        //실행순서 : apply -> andThen
        Integer num2 = fx.andThen(result -> result + 100).apply("10");
        System.out.println(num2);

        Consumer<String> transform = s -> System.out.println(s + "님 환영합니다.");

        transform.accept("김준일");


        Supplier<Integer> role = () -> {
            Integer result = num + 999;
            return result;
        };

        System.out.println(role.get());

        Predicate<Integer> even = n -> n % 2 == 0;
        System.out.println(even.test(10));
    }
}
