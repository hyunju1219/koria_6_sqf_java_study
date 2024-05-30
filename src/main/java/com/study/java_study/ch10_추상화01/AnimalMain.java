package com.study.java_study.ch10_추상화01;

public class AnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog("콩이",2,"말티즈");
        Animal tiger = new Tiger("랑이",3,100);

        dog.move();
        tiger.move(); //업캐스팅해도 재정의된 메서드가 호출됨
        ((Tiger)tiger).hunt();

        dog.bark();

        System.out.println();
        Animal[] animals = new Animal[3];
        animals[0] = new Animal("이름없는 동물", 10);
        animals[1] = new Dog("콩이",2,"말티즈");
        animals[2] = new Tiger("랑이",3,100);

        for(Animal animal : animals) {
            animal.move();
        }
        System.out.println();
        for(Animal animal : animals) {
            if(animal instanceof Tiger) {
                Tiger t = (Tiger) animal;
                t.hunt();
            } else if (animal instanceof Dog) {
                Dog d = (Dog) animal;
                d.bark();
            }
        }

        for(Animal animal : animals) {
            if(animal.getClass() == Tiger.class) {
                Tiger t = (Tiger) animal;
                System.out.println(Tiger.class);
                System.out.println(animal.getClass()); //getClass() : 참조하고 있는 클래스 확인(클래스타입으로 반환)
                Class a = animal.getClass();
                System.out.println(a);
                t.hunt();
            } else if (animal.getClass() == Dog.class) {
                Dog d = (Dog) animal;
                d.bark();
            }
        }

//        //부모타입으로 생성 -> 자식 메서드, 변수 사용불가(업캐스팅: 묵시적형변환)
//        Animal a = (Animal) new Tiger(); //업캐스팅(Animal) 생략가능 ,(tiger부분만 비활성화, 주소는 유지)
//
//        Tiger t = (Tiger) a; //다운캐스팅(명시적형변환) 생략불가능(비활성화되었던 tiger부분이 다시 활성화)
//
//        Animal a2 = new Animal();
//        //Tiger t2 = (tiger)a2; => a2에는 tiger 공간이 생성안되어잇음 다운캐스팅안됨
//        //다운캐스팅은 업캐스팅된 객체만 가능하다.
//        Animal a3 = new Dog();
//        //Tiger t3 = (tiger)a3; => tiger 공간이 생성되지 않았기 때문에 다운캐스팅 불가
//        Dog d = (Dog)a3; //=>이건 가능, dog 공간이 생성되었ㅇ기 때문
//
//        //왜 사용하냐
//        Animal[] animals = new Animal[3];
//        //Animal타입
//        animals[0] = new Animal();
//        animals[1] = new Tiger();
//        animals[2] = new Dog();


    }
}
