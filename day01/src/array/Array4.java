package array;

import java.util.Arrays;
import java.util.Random;

public class Array4 {
    public static void main(String[] args) {
        // Reference Type...
        int [] arr1 = new int[5];
        int arr2 [] = new int[5];
        int [] arr3 = {1,2,3,4,5};

        Random rand = new Random();

        for(int i=0;i<5;i++){
            int num = rand.nextInt(10)+1;
            if(Arrays.stream(arr1).anyMatch(value -> value == num)){
                if(i != 0){
                    i--;
                }
            }else{
                arr1[i] = num;
            }
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.stream(arr1).sum());
        System.out.println(Arrays.stream(arr1).average().getAsDouble());
        System.out.println(Arrays.stream(arr1).max().getAsInt());
        System.out.println(Arrays.stream(arr1).min().getAsInt());
    }
}