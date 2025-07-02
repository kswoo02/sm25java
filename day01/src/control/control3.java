package control;

public class control3 {
    public static void main(String[] args) {

        // 1~10까지 합과 평균 구하시오
        // While

        int i = 0;
        int sum = 0;
        while (i<10) {
            sum += i;
            i++;
        }
        System.out.println("1부터 10까지의 합 = " + sum);
        System.out.println("평균 = " + sum / i);
    }
}
