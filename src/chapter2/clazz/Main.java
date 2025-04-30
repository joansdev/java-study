package chapter2.clazz;

public class Main {
    public static void main(String[] args) {
        // 인스턴스화 (= 객체 만들기)
        Person personA = new Person("yohan", 27);
        Person personB = new Person("jihee", 23);

        // 속성에 접근 (할당, 재할당 등의 작업)
//        personA.name = "yohan";
//        personB.name = "jihee";

        // 기능 활용
        int sumResultA = personA.sum(1, 2);
        int sumResultB = personA.sum(3, 4);

        String name = personA.getName();
        personA.setAddress("ansan");
    }
}
