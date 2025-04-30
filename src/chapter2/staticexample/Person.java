package chapter2.staticexample;

public class Person {

    // 인스턴스 변수
    String name;


    // static 변수
    static int population = 0;

    // 생성자
    Person() {
        population++; // 인스턴트 생성시마다 인구수 +1
    }

    // 인스턴스 메서드
    void printName() {
        System.out.println("this.name = " + this.name);
    }

    // static 메서드
    static void printPopulation () {
        System.out.println("현재 인구 수 = " + population);
    }

}