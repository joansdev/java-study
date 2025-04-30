package chapter2.polymorphism;

public class Cat implements Animal{
    @Override
    public void makeSound() {
        System.out.println("먀아옹");
    }

    @Override
    public void exist() {
        System.out.println("고양이는 존재한다");
    }

    public void scratch(){
        System.out.println("(벅벅 긁기)");
    }
}
