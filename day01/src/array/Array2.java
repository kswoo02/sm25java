package array;
import java.util.Random;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {

        String[] strs = new String[3];
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < 3; i++)
        {
            System.out.print("문자 입력 : ");
            strs[i] = sc.nextLine();
        }

        for (int i = 0; i < 3; i++)
        {
            System.out.println("strs[" + i + "]: " + strs[i]);
        }
        sc.close();
    }
}