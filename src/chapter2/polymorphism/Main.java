package chapter2.polymorphism;

public class Main {
    public static void main(String[] args) {

        // 다형성 활용
        Animal ani1 = new Cat();
        Animal ani2 = new Dog();

        ani1.exist();
        ani1.makeSound();

        ani2.exist();
        ani2.makeSound();

        // 업캐스팅 주의사항 ---
//        ani1.scratch(); X
//        ani2.wag(); X
        // 자식 타입들의 "고유 기능"은 사용할 수 없다
        // (상속받은, 오버라이딩 받은 기능들은 사용 가능)


        // 다운캐스팅 --- 자식들 고유기능 사용 가능하도록
        long bigBox =1;
        int smallBox = (int) bigBox;

        Cat cat = (Cat) ani1;
        cat.scratch();

        Dog dog = (Dog) ani2;
        dog.wag();

        // 잘못된 다운캐스팅 문제 (강아지를 Cat에다 넣어버린다는 등)
//        Cat cat2 = (Cat) ani2; // 실행시키기 전까진 오류 감지 X

        // 다운캐스팅 시 instanceof 활용
        if (ani2 instanceof Cat){
            Cat cat2 = (Cat) ani2;
            cat2.scratch();
        } else {
            System.out.println("객체가 고양이가 아님");
        }

        Animal[] animals = {new Cat(), new Dog(), new Cat()};

        System.out.println("::::");
        for (Animal animal : animals){
            animal.makeSound();
        }

    }
}
