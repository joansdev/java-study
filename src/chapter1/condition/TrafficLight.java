package chapter1.condition;

import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("신호등 색상 입력(초록, 노랑, 빨강");
        String color = scanner.nextLine();


        if (color.equals("빨강")) {
            System.out.println("멈춰");
        } else if (color.equals("노랑")) {
            System.out.println("주의하셈");
        } else if (color.equals("초록")) {
            System.out.println("건너");
        }
        else {
            System.out.println("잘못된 입력.");
        }
    }
}
