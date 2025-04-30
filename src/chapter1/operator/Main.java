package chapter1.operator;

public class Main {
    public static void main(String[] args) {

        // 복합 대입 연산자
        int num = 5;
        num += 3; // num = num+3;
        System.out.println("num = " + num);

        num -= 2; // num = num+3;
        System.out.println("num = " + num);

        num *= 2; // num = num+3;
        System.out.println("num = " + num);

        num /= 3; // num = num+3;
        System.out.println("num = " + num);

        num %= 3; // num = num+3;
        System.out.println("num = " + num);

        // 증감 연산자 - 변수를 1씩 증가,감소
        num = 1;
        num++;
        num++;
        num--;
        num--;
        System.out.println("num = " + num);
        
        // 전위 연산 (++i) - 연산 후의 값이 활용됨
        int intBox = 5;
        System.out.println("(++intBox) = " + (++intBox));

        // 후위 연산
        int intBox2 = 5;
        System.out.println("(intBox2++) = " + (intBox2++));
        System.out.println("(intBox2) = " + (intBox2));


        // 비교 연산자
        // 같음 연산자(=) - 두 값 같으면 true, 다르면 false
        System.out.println("10 == 10: = " + (10 == 10));

        // 다름 연산자 (!=)
        System.out.println("10 != 5 = " + (10 != 5));

        // 크기비교연산자
        System.out.println("10 < 5: " + (10 < 5) );
        System.out.println("10 =< 5: " + (10 <= 5) );


        // 논리 연산자
        // AND 연산자 (&&) - 두 조건이 모두 참일 때 true
        System.out.println("true && true = " + (true && true));
        int age = 20;
        boolean isStudent = true;
        System.out.println(":::" + ((age>18) && isStudent));

        // OR 연산자 (||) - 두 조건 중 하나라도 참이면 true
        System.out.println("true && false = " + (true || false));
        
        // NOT 연산자 (!) - true->false / false->true
        System.out.println("(!true) = " + (!true));


        // 연산자 우선순위: 산술 → 비교 → 논리 → 대입
        boolean flag = 10 + 5 > 12 && true;
        System.out.println(flag);
        // 실행 순서: (10 + 5) > 12 && true : 산술
        // → 15 > 12 && true : 비교
        // → true && true : 논리
        // → flag = true 대입
        boolean flag2 = ((10 + 5) > 12) && true; // 바람직한 표현

        // 논리연산자 우선순위 (! -> && -> ||)
        boolean result = true || false && false;
        System.out.println("result = " + result);

        boolean result2 = true || false && !false;
        System.out.println("result2 = " + result2);


        // 문자열 비교
        String text = "hello";
        String text2 = "Hello";
        boolean isEqual = text.equals(text2);
        System.out.println("isEqual = " + isEqual);
    }
}
