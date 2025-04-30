package chapter1.array;

public class PrefixSum {
    public static void main(String[] args) {
        // 배열 총합
        int[] arr = {2,5,8};
        int sum = 0;


        for (int a : arr){
            sum += a;
        }
        System.out.println("총합 = " + sum);
    }

    // 2차원 배열 좌표 찾기
    boolean[][] board = {
            {true, false},
            {false, true}
    };

}
