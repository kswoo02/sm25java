package control;

public class control5_while {
    public static void main(String[] args) {
        // 1~10까지의 숫자중 짝수의 합과 평균을 구하시오
        // while

        int num=0;
        int sum = 0;
        int evenCount = 0;

        while(num<=10)
        {
            num++;
            if(num % 2 == 0) {
                sum += num;
                evenCount++;
            }
        }
        double average = (double) sum / evenCount;
        System.out.println("짝수의 합 = " + sum);
        System.out.println("평균 = " + average);

    }
}
