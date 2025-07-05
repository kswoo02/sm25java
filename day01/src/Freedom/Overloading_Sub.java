package Freedom;

public class Overloading_Sub {
        int add(int a, int b) {
            System.out.println("첫번째 a+b 출력");
            return a + b;
        }

        int add(int a, int b, int c) {
            System.out.println("두번쨰 정수 3개 덧셈 호출");
            return a + b + c;
        }
        double add(int a, double b, double c, double d) {
            System.out.println("int a = " + a + "double b = " + b + "double c =" + c + "double d = " + d);
            return a + b + c + d;
        }
}

