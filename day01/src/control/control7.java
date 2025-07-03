package control;

import java.util.Scanner;
import java.util.*;

public class control7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Enter Command:(arr1, arr2, arr3)");
            String str = sc.nextLine();
            if("q".equals(str)){
                System.out.println("quit");
                break;
            }
            else if ("arr1".equals(str)){
                // 단일 숫자 로또 프로그램 생성, 1~10, 입력 받고
                // 그 랜덤으로 숫자마다 등수 생성하여
                // 각 등수 별로 500 300 150 100 80만원 제공 하고
                // 숫자별 전체 등수 출력 내 숫자 등수 출력 얼마를 지급하겠다 당첨 없으면 안타깝다 출력
                System.out.println("1~10 사이의 숫자를 입력하세요:");
                int userNumber = 0;
                try {
                    userNumber = Integer.parseInt(sc.nextLine());
                    if (userNumber < 1 || userNumber > 10) {
                        System.out.println("잘못된 입력입니다. 1에서 10 사이의 숫자를 입력해주세요.");
                        continue;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
                    continue;
                }

                // 등수 리스트 생성 (1~5등, 나머지는 꽝)
                List<Integer> ranks = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
                Collections.shuffle(ranks);

                // 숫자별 등수 매핑
                Map<Integer, Integer> lotteryResults = new HashMap<>();
                for (int i = 0; i < ranks.size(); i++) {
                    lotteryResults.put(i + 1, ranks.get(i));
                }

                // 전체 등수 출력
                System.out.println("\n======= 전체 로또 결과 =======");
                for (int i = 1; i <= 10; i++) {
                    int rank = lotteryResults.get(i);
                    System.out.print("숫자 " + i + ": ");
                    if (rank > 0) {
                        System.out.println(rank + "등");
                    } else {
                        System.out.println("꽝");
                    }
                }

                // 내 숫자 등수 및 상금 출력
                System.out.println("\n======= 나의 로또 결과 =======");
                int myRank = lotteryResults.get(userNumber);
                System.out.println("내 번호: " + userNumber);
                System.out.println("결과: " + (myRank > 0 ? myRank + "등" : "꽝"));

                int prizeMoney = 0;
                switch (myRank) {
                    case 1: prizeMoney = 10; break;
                    case 2: prizeMoney = 9; break;
                    case 3: prizeMoney = 8; break;
                    case 4: prizeMoney = 7; break;
                    case 5: prizeMoney = 6; break;
                    case 6: prizeMoney = 5; break;
                    case 7: prizeMoney = 4; break;
                    case 8: prizeMoney = 3; break;
                    case 9: prizeMoney = 2; break;
                }

                if (prizeMoney > 0) {
                    System.out.println("축하합니다! " + prizeMoney + "억에 당첨되셨습니다!");
                } else {
                    System.out.println("안타깝지만, 당첨되지 않았습니다.");
                }
                System.out.println();

            }
            else if ("arr2".equals(str)){
                // 1개의 1~10까지의 숫자를 입력 받는다
                // 해당 사이즈의 1차원 배열을 생성한다.
                // 배열에 랜덤하게 1~10까지의 값을 중복되지 않게 입력한다.
                // 1. 배열값을 출력하고
                // 2. 배열값이 합과 평균을 출력
                // 3. 최대,최소 값 출력

                int ary[] = new int[10];

                System.out.println("숫자 3개 입력");

                for (int i = 0; i < ary.length; i++) {
                    System.out.print((i + 1) + "번째 숫자: ");
                    ary[i] = Integer.parseInt(sc.nextLine());
                }
                int sum = 0;
                int min = ary[0];
                int max = ary[0];

                for (int i = 0; i < ary.length; i++) {
                    sum += ary[i];
                    if (ary[i] < min) {
                        min = ary[i];
                    }
                    if (ary[i] > max) {
                        max = ary[i];
                    }
                }

                int avg = sum/ary.length;
                System.out.println("전체 : " + sum);
                System.out.println("평균 : " + avg);
                System.out.println("최소 : " + min);
                System.out.println("최대 : " + max);




            } else if ("arr3".equals(str)) {
                // 1개의 1~5까지의 숫자를 입력 받는다
                // 해당 사이즈의 2차원 배열을 생성한다.
                // 배열에 랜덤하게 1~30까지의 값을 중복되지 않게 입력한다.
                // 1. 배열값을 출력하고
                // 2. 배열값이 합과 평균을 출력
                // 3. 최대,최소 값 출력

                int numm1[][] = new int[5][5];


//                String o_num = sc.nextLine();

                for(int i=0; i<numm1.length; i++){
                    for ( int j=0; j<numm1[i].length; j++){
                        System.out.println("입력받으세요 :");

                        numm1[i][j] = Integer.parseInt(sc.nextLine());
                    }
                }
                for(int i=0; i<numm1.length; i++){
                    for(int j=0; j<numm1[i].length; j++){
                        System.out.print(numm1[i][j] + "  ");
                    }
                    System.out.println();

                }
                int sum = 0;
                int min = numm1[0][0];
                int max = numm1[0][0];

                for (int i = 0; i < numm1.length; i++) {
                    for (int j = 0; j < numm1[i].length; j++) {
                        sum += numm1[i][j];
                        if (numm1[i][j] < min) {
                            min = numm1[i][j];
                        }
                        if (numm1[i][j] > max) {
                            max = numm1[i][j];
                        }
                    }
                }
                double avg = (double) sum / (numm1.length * numm1[0].length);
                System.out.println("\n--- 최종 결과 ---");
                System.out.println("합계: " + sum);
                System.out.println("평균: " + avg);
                System.out.println("최소값: " + min);
                System.out.println("최대값: " + max);
            }

        }
        sc.close();
    }
}
