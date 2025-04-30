package chapter2.clazz.task;

import java.security.PublicKey;

public class Car {
    String name;
    int speed;


    // 생성자
    Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    // 메서드
    void drive() {
        System.out.println(name+"을 주행합니다" );
    }
}
