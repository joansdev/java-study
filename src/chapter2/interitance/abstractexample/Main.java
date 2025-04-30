package chapter2.interitance.abstractexample;

public class Main {
    public static void main(String[] args) {

        // 추상클래스(Animal 클래스)는 인스터스화 불가
//        Animal animal = new Animal();

        Cat cat = new Cat();
        cat.name = "cat";
        cat.sleep();

        // 자식에서 강제구현(abstract)된 메서드
        // -> 구현 안 하면 에러
        cat.eat();
    }
}
