package chapter2.capsulation;

public class Main {
    public static void main(String[] args) {

        // 생성자 호출시 접근제어자 범위
        Person person = new Person("yohan", "??");

        // 인스턴스 변수 접근
//        person.name = "yohan";
//        person.secret = "??"
//
//        // 인스턴스 메서드 접근
//        person.methodA();
//        person.methodB();

        // 게터 - 캡슐을 뚫고 정보를 가져와라 !
        String name = person.getName();
        System.out.println("name = " + name);

        // 세터
        person.setName("jihee");
        String name2 = person.getName();
        System.out.println("name2 = " + name2);
    }
}
