package com.study.java_study.ch18_빌더;

public class DataMain {
    public static void main(String[] args) {
        Data data  = new Data("a", 10, 10.5, "b");
        Data data2 = new Data();
        data2.setData1("a");
        data2.setData3(3.14);


        DataEntity dataEntity = DataEntity.builder()
                .data1("a")
                .data2(10)
                .data4("b")
                .build();//순서 상관없다.

        DataEntity2 dataEntity2 = DataEntity2.builder()
                .data1("z")
                .data2(33)
                .data3(3.14)
                .build();

        Student student = Student.builder()
                .studentCode(1)
                .name("학생")
                .age(19)
                .build();



    }
}
