package control;

public class control2 {
    public static void main(String[] args) {
        int sum = 0;
        int count;

        for (count = 1; count <= 10; count++)
        {
            sum += count;
        }

        double avg = (double) sum / 10;
        System.out.printf("합계: %d, 평균: %5.2f%n", sum, avg);
    }
}