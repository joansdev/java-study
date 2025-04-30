package chapter3.lambda;

@FunctionalInterface // 함수형 인터페이스다 선언!
public interface Calculator {
    int sum(int a, int b); // 추상 메서드
}

// 함수형 인터페이스 안엔 1개의 함수만 만들어야 한다
// 2개 이상의 함수가 있다면 lambda식 사용시 어떤 함수를 구현하는 건지 컴파일러가 알지 못한다
