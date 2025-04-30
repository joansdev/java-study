package chapter2.staticexample;

public class Main {
    public static void main(String[] args) {

        // 클래스 멤버
        // 클래스의 레벨에 접근해서 "바로 사용" 가능 (객체 생성 없이도)
        // static 변수/메서드 활용 (=고정 변수/메서드)
        System.out.println("static 변수 활용: " + Person.population);
        Person.printPopulation();

        // 인스턴스 멤버(변수, 메서드) 활용 - 공유되지 않음 (각각의 개체별로 다른 데이터)
        Person p1 = new Person();
        Person p2 = new Person();

        // 인스턴스 변수 활용
        p1.name = "yohan";
        p2.name = "jihee";

        // 인스턴스 메서드 활용
        p1.printName();
        p2.printName();


    }
}
