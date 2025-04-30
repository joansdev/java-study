package chapter3.exception;

public class Main {
    public static void main(String[] args) {

        // 의도하지 않은 예외
//        int ret = 10 / 0;
//        System.out.println("ret = " + ret);
//        System.out.println("프로그램 종료");

        // 의도적인 예외 - throw
//        int age = 10;
//        if (age < 20){
//            throw new IllegalArgumentException("미성년자 접근 금지");
//        }
//        System.out.println("프로그램 종료");

        // 3. 언체크 예외 호출
        ExceptionPractice ex1 = new ExceptionPractice();
//        ex1.callUncheckedException();

        try {
            ex1.callCheckedException();
        } catch (Exception e) {
            System.out.println("체크 예외 처리");
        }


        System.out.println("프로그램 종료");
    }
}
