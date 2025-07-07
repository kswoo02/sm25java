package shop.app;

import shop.service.CustService;

import java.util.Scanner;

public class CustApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CustService custService = new CustService();

        while(true){
            System.out.println("Enter Command:");
            String cmd = sc.nextLine();
            if(cmd.equals("q")){
                System.out.println("Quit...");
                break;
            }else if(cmd.equals("i")){
                System.out.println("Insert...");
            }else if(cmd.equals("sa")){
                System.out.println("Search All...");
            }else if(cmd.equals("s")){
                System.out.println("Search...");
            }else if(cmd.equals("d")){
                System.out.println("Delete...");
            }else if(cmd.equals("u")){
                System.out.println("Update...");
            }else{
                System.out.println("Invalid Command...");
            }
        }
        sc.close();
    }
}