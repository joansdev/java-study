package chapter1.method;

public class Main {
    public static void main(String[] args) {
        // 객체를 객체화(소환!)
        Calculator calculator = new Calculator();
        
        int answer = calculator.sum(1,2);
        System.out.println("answer = " + answer);
    }
}
