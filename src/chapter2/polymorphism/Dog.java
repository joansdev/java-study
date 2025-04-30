package chapter2.polymorphism;

public class Dog implements Animal{
    @Override
    public void makeSound() {
        System.out.println("멍멍");
    }

    @Override
    public void exist() {
        System.out.println("강아지는 존재한다");
    }

    public void wag(){
        System.out.println("(꼬리를 흔든다)");
    }
}
