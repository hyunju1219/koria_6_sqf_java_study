package com.study.java_study.ch14_Object;

import lombok.*;

@NoArgsConstructor //기본생성자
@AllArgsConstructor //매개변수 생성자
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
@Data // 위에 4개 포함
public class Teacher {
    private String name;
    private int age;
}

