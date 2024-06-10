package com.study.java_study.ch20_람다식;

/*
    람다(Lambda)조건
    1. 하나의 추상 메소드를 정의하고 있는 인터페이스에서 사용한다.
    2. 매개변수의 타입을 생략할 수 있다.
    3. 매개변수가 하나이면 매개변수를 감싸는 ()괄호를 생략할 수 있다.
    4. 다른 명령없이 바로 리턴만 한다면 메소드를 정의하는 {} 중괄호와 return 키워드를 생략할 수 있다.

 */

@FunctionalInterface // 함수형 인터페이스(메서드 1개만 가능) 람다식으로 사용하는 인터페이스
public interface Modification<T> {
    T modify(T oldData, T newData);
}
