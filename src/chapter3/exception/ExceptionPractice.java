package chapter3.exception;

public class ExceptionPractice {

    // 1. 언체크 예외 호출 예시
//    public void callUncheckedException() {
//        try {
//            if (true) {
//                System.out.println("언체크 예외 발생");
//                throw new RuntimeException();
//            }
//        } catch (RuntimeException e) {
//            System.out.println("언체크 예외 처리");
//        }
//
//
//    }

    // 2. 체크 예외 호출
    public void callCheckedException() throws Exception { // throws 구문으로, 예외를 상위 메소드인 Main.java에서 처리해줄 거라고 던지기 (try-catch문을 메인메소드 안에 구현하겠다)

        if (true) {
            System.out.println("체크 예외 발생");
            throw new Exception();
        }
    }
}
