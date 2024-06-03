package com.study.java_study.ch16_제네릭;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Data
public class Sender<T,T2, T3> { //타입 여러 개 생성 가능
    private T data1;
    private T2 data2;
    private T3 data3;
}
