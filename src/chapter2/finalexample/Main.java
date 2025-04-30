package chapter2.finalexample;

public class Main {
    public static void main(String[] args) {

        // final 활용법
        final int a = 1;
//        a = 2; -> 변수 재할당시 오류

        // 상수 활용 방법
        System.out.println("상수 활용 = " + Circle.PI);

        // 불변 객체 사용
        final Circle c1 = new Circle(2);
        // 참조 변경은 막지만 내부상태 변경은 막지 X
        // 근데 모든 속성에 final이 붙어있다면 내부상태 변경도 안 되겠지.

        System.out.println("c1 = " + c1);

        // 불변객체 내부 상태 변경 필요한 경우
        Circle c2 = new Circle(10); // 생성자
        Circle c3 = c2.changeRadius(20); // 기능 활용
    }
}
