package chapter1.array;

public class Main {
    public static void main(String[] args) {
        // 모험가 명단 관리
        String name1 = "gygym";
        String name2 = "yohan";

        String[] nameList = {name1, name2};

        // 배열 선언 + 길이 할당
//        int[] arr = new int[5]; // [] [] [] [] [] 5개
//
        // 배열 선언과 동시에 배열 요소 할당
        int[] arr2 = {10, 20, 30, 40, 50}; //중괄호 {}

        // 배열 길이?
        System.out.println(arr2.length);

        String[] strArr = new String[5];

        boolean[] booleanArr = new boolean[3];

        // 배열 요소에 접근: index
        System.out.println("arr2[0] = " + arr2[0]);

        arr2[0] = 100;
        System.out.println("arr2[0] = " + arr2[0]);

        // 향상된 for문 **
        for (int a : arr2){
            System.out.println("값 = " + a);
        }

        // 2차원 배열
        boolean[][] board = new boolean[2][4];
        // [] [] [] []
        // [] [] [] []


        boolean[][] board2 = {
                {true, false},
                {false, true}
        };

    }
}
