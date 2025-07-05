package Freedom;

public class Overloading_Main {
    public static void main(String[] args) {

        Overloading_Sub calc = new Overloading_Sub();

        System.out.println("결과: " + calc.add(10, 20));
        System.out.println("결과: " + calc.add(10, 20, 30));
        System.out.println("결과: " + calc.add(10,20,30,40));
    }
}
