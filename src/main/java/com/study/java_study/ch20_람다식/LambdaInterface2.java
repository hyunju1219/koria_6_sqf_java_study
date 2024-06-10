package com.study.java_study.ch20_람다식;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaInterface2 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("프로그램 실행");
            }
        };
        Runnable runnable1 = () -> System.out.println("프로그램 실행1");
        runnable.run();
        runnable1.run();

        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("integer : " + integer);
            }
        };

        Consumer<Integer> consumerStr = i -> System.out.println("consumer String : " + i + " + 십");
        Consumer<String> consumerInt = str -> System.out.println("consumer Integer : " + (Integer.parseInt(str) + 10));

        consumer.accept(10);
        consumerStr.accept(10);
        consumerInt.accept("10");

        Predicate<Integer> predicate1 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                return n % 2 == 0;
            }
        };
        Predicate<Integer> predicate = integer -> integer % 2 == 1;

        System.out.println(predicate.test(9));

        Function<String, Integer> fx1 = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s) + 10;
            }
        };
        Function<String, Integer> fx = s -> Integer.parseInt(s) + 10;
        Integer num = fx.apply("10");
        Integer num2 = fx.andThen(i -> i + 100).apply("99");
        System.out.println(num + num2);

        Supplier<Integer> supplier1 = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return 0;
            }
        };
        Supplier<Integer> supplier = () -> num2 + 999;
        System.out.println("number : " + supplier.get());

//        String[] str = {"10", "20", "9"};
//        Arrays.sort(str, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return 0;
//            }
//        });
    }
}
