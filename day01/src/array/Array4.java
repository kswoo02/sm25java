package array;

import java.util.Random;

public class Array4 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Random rand = new Random();

        for(int i = 0; i < 5; i++){
            arr[i] = rand.nextInt(10);
            System.out.println("arr["+i+"] = "+arr[i]);
        }

        boolean isDuploicate = false;
        for(int i = 0; i < 5; i++){
            if(arr[i] == arr[j]){
                isDuploicate = true;
                break;
            }

            if(isDuploicate){
                break;
            }
        }




    }
}
