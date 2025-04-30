package chapter1.operator;

public class Task {
    public static void main(String[] args) {
        // 연산자 실습과제 1
        int a = 15;
        int b = 4;

        System.out.println("덧셈 결과 = " + (a+b));
        System.out.println("뺼셈 결과 = " + (a-b));
        System.out.println("곱셈 결과 = " + (a*b));
        System.out.println("나눗셈 결과 = " + (a/b));
        System.out.println("나머지 결과 = " + (a%b));

        // 연산자 실습과제 2
        int x = 10;
        int y = 20;

        boolean isGreater = x > y;
        boolean isSmaller = x < y;
        boolean isEqual = x == y;
        boolean isNotEqual = x != y;

        System.out.println("x가 y보다 큰가? " + isGreater);
        System.out.println("x가 y보다 작은가? " + isSmaller);
        System.out.println("x와 y가 같은가? " + isEqual);
        System.out.println("x와 y가 다른가? " + isNotEqual);

        // 연산자 실습과제 3
        String text = "Hello";
        String text2 = "Java";
        boolean result = text.equals(text2);
        System.out.println("result = " + result);
    }
}
