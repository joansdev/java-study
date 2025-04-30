package chapter1.io;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        System.out.println("hello java" );

        // 출력 (Scanner)
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(a);
    }
}
