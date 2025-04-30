package chapter1.loop;

public class Main {
    public static void main(String[] args) {

        // 반복문
        // for (시작조건, 종결조건, 조건변화수식) {
        // }

        for (int i=1; i<=10; i++) {
            if (i==4){
                break;
            }
            if (i==2){
                continue; // = skip
            }
            System.out.println(i+"번째 손님 안녕하셈");
        }


        // while문
        int i = 1;
        while (i <= 10) {
            System.out.println("무한");
            i++;
        }

        // do-while문 - while문인데, 종결조건을 반복문 실행 이후에 검토함
        int a= 1;
        do {
            System.out.println("hi");
            a++;
        }while (a <= 10);
    }
}
