package chapter2.prac;

import chapter2.polymorphism.Animal;

public class Dolphin implements Animal {
    @Override
    public void makeSound() {
        System.out.println("꾸잉 꾸잉(돌고래 소리)");
    }

    @Override
    public void exist() {
        System.out.println("돌고래는 존재한다");
    }

    public void swim(){
        System.out.println("헤~~~엄, 헤~~~엄!");
    }
}
