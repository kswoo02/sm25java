package array2;

import java.util.Arrays;
import java.util.Random;

public class Array3 {
    public static void main(String[] args) {
        // 5행 5열 배열에
        // 1~100까지의 random 한 숫자를 입력
        // 단, 중복돼서 들어가면 안됨
        // 최종 배열을 출력
        Random rand = new Random();

        int arr[][] = new int[5][5];
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                arr[i][j] = rand.nextInt(100) + 1;
            }
        }
        for(int n[]: arr)
        {
            System.out.println(Arrays.toString(n));

        }
    }
}

