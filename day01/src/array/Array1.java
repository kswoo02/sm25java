package array;

import java.util.Random;

public class Array1 {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int arr2[] = new int[5];
        int[] arr3 = {1, 2, 3, 4, 5};

        Random rand = new Random();

        for (int i = 0; i < 5; i++) {
            arr1[i] = rand.nextInt(10) + 1;
        }

        for(int n :arr1){
            System.out.println(n+ " ");
        }

        System.out.println();
        for(int n : arr1){
            System.out.println(n+" ");
        }

    }
}