package chapter2.clazz;

public class Person {

    // 1. 속성 - 변수 선언으로 표현
    String name;
    int age;
    String address;

    // 2. 생성자 (조립설명서)
    // 기본생성자: Person() {}
    // 특징1-반환타입 존재X / 특징2-여러개 존재가능
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    // 3. 기능 (메서드)
    int sum(int val1, int val2){
        int result = val1 + val2;
        return result;
    }

    // 게터 - 속성을 가져오는 기능
    String getName() {
        return this.name;
    }

    //세터 - 속성을 설정해주는 기능
    void setAddress(String address) {
        this.address = address;
    }
}
