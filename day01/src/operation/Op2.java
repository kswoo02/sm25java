package operation;

public class Op2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        if(a++ <0 && b++ > 0) { //  | -> a가 0보다 크거나 b가 0보다 작으면
            System.out.println("OK");
        }else {
            System.out.println("Fail");
        }
        System.out.printf("  %d, %d \n",a,b);
    }
}
