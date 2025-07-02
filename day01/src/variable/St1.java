package variable;

public class St1 {
    public static void main(String[] args) {
        // Reference Type ... Primitive Type X
        // Reference => Class Object
        String st1 = new String("abc"); // original: 빼고 "abc"만 넣어주면 돼!
        String st2 = new String("abc"); // 여기도 똑같이 수정!

        String st3 = "abc";
        String st4 = "abc";

        if(st1.equals(st3)) {
            System.out.println("OK3");
        }
        if(st1.equals(st2)) {
            System.out.println("OK2");
        }
    }
}