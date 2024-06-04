package com.study.java_study.ch18_빌더;

public class DataEntity {
    private String data1;
    private int data2;
    private double data3;
    private String data4;

    public DataEntity(String data1, int data2, double data3,String data4) { //생성자
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
        this.data4 = data4;
    }
    public static DataEntityBuilder builder() { //내부클래스 호출 메서드
        return new DataEntityBuilder();
    }
    public static class DataEntityBuilder { //1. static 빌더 내부 클래스 작성
        private String data1;
        private int data2;
        private double data3;
        private String data4;

        public DataEntity build() { //2. 리턴이 데이터 클래스(외부)인 빌드 메서드
            return new DataEntity(data1, data2, data3, data4); //데이터 클래스 생성자호출
        }

        //멤버변수 별로 메서드 작성(반환타입은 자기자신의 주소)
        public DataEntityBuilder data1(String data1) {
            this.data1 = data1;
            return this;
        }

        public DataEntityBuilder data2(int data1) {
            this.data2 = data2;
            return this;
        }

        public DataEntityBuilder data3(double data3) {
            this.data3 = data3;
            return this;
        }

        public DataEntityBuilder data4(String data4) {
            this.data4 = data4;
            return this;
        }
    }

}
