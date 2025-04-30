package chapter2.clazz.wrapper;

public class Main {
    public static void main(String[] args) {
        
        // 기본형 변수
        int a = 1;
        System.out.println("a = " + a);
        
        // 참조형 변수 (위에처럼 직접적인 데이터가 저장되는게 아닌)
        // personA(참조형변수)라는 변수의 "데이터가 저장된 곳(Heap공간)의 주소값"
        Person personA = new Person();
        System.out.println("personA = " + personA);

        // 배열 또한 참조형변수다
        int[] arr = {1,2,3,4,5};
        System.out.println("arr = " + arr);


        // 래퍼클래스 - 기본형 변수를 감싸주는 "객체" (Integer, Long 등등)
        // = 참조형변수 -> 하지만 찍어보면 데이터의 주소값이 나오지 않고 바로 직접데이터가 뜸
        Integer num = 100;
        System.out.println("num = " + num);

        String numStr = num.toString();

        // 직접 만든 래퍼클래스
        CustomInteger myInteger = new CustomInteger(10);
        String myStrInteger = myInteger.toString();

        // 오토박싱 (기본형 -> 래퍼)
        Integer num3 = 10;
//        Integer num3 = Integer.valueOf(10); - 내부적으로는 이런 과정이 일어나는 것

        // 오토 언박싱 (래퍼-> 기본형)
        int num4 = num3;
        // int a = num.intValue(); - 내부적으로는 ..

        // *** 기본형 vs 래퍼 -> 단순 반복작업 등의 경우 기본형이 훨씬 빠르다

    }
}
