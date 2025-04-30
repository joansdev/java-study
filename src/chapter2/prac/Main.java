package chapter2.prac;

import chapter2.polymorphism.Animal;
import chapter2.polymorphism.Cat;

public class Main {
    public static void main(String[] args) {
        Animal ani1 = new Bird();
        Animal ani2 = new Dolphin();

        Bird bird = (Bird) ani1;
        bird.fly();
    }
}
