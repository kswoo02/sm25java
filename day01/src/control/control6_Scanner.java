package control;

import java.util.Scanner;

public class control6_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("입력하세요");
            String str = sc.nextLine();
            if("exit".equals(str)){
                System.out.println("!!!");
                break;
            }
            else if ("hi".equals(str)){
                System.out.println("HELLO");
            }
            else {
                System.out.println("Invalid Command...");
            }




//            if(cmd.equals("q")){
//                System.out.println("Quit!");
//                break;
//            } else if (cmd.equals("i")) {
//                System.out.println("Insert");
//            }else if (cmd.equals("s")) {
//                System.out.println("Search");
//            }else if (cmd.equals("d")) {
//                System.out.println("Delete");
//            }else if (cmd.equals("u")) {
//                System.out.println("Update");
//            }else {
//                System.out.println("Invalid Command...");
//
//            }
        }
        sc.close();
    }
}
