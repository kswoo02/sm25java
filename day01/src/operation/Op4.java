package operation;

public class Op4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        // 3수의 최대 값과 최소 값을 구하시오
        if(a > b && a > c)
        {
            System.out.println(a) ;
        }
        else if(b > a && b > c)
        {
            System.out.println(b) ;
        }
        else
        {
            System.out.println(c) ;
        }
    }
}
