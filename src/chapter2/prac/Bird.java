package chapter2.prac;

import chapter2.polymorphism.Animal;

public class Bird implements Animal {
    @Override
    public void makeSound() {
        System.out.println("짹쨱");
    }

    @Override
    public void exist() {
        System.out.println("새는 존재한다");
    }

    public void fly(){
        System.out.println("훨훨 난다 ~!~!~!~!");
    }
}
