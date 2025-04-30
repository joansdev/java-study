package chapter1.condition;

public class Main {
    public static void main(String[] args) {

        // 조건문
        // if

//        String light = "빨강";
//
//        if (light.equals("초록")) {
//            System.out.println("건너셈!");
//        } else if (light.equals("노랑")) {
//            System.out.println("조심하셈 !!!!!!" );
//        } else {
//            System.out.println("멈추셈." );
//        }


        // switch문
        int number = 3;

        switch (number) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;

            default:
                System.out.println("1도 2도 아님");
        }

    }
}
