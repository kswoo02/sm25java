package Model;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- 음료 정보 출력 시작 ---");
        System.out.println();

        System.out.println("=== AlcoholicDrink 정보 ===");
        //       [  변수 선언 ]          [ 객체 생성 및 초기화 ]
        AlcoholicDrink al = new AlcoholicDrink("테라", "하이트진로", "시원함", 500, 200, 2500, 4.5, "대한민국");
        // 메서드 호출
        al.showInfo();
        al.drink();
        System.out.println();

        System.out.println("=== Coffeeeeee 정보 ===");
        Coffeeeeee cof = new Coffeeeeee("아메리카노", "스타벅스", "활력", 355, 10, 4500, 150.0, "콜롬비아", "미디엄");
        cof.showInfo();
        cof.drink();
        System.out.println();

        System.out.println("=== EnergyDrink 정보 ===");
        EnergyDrink Ener = new EnergyDrink("게토레이", "펩시코리아", "운동 후 갈증 해소", 600, 150, 2000, 10, 5, 20);
        Ener.showInfo();
        Ener.drink();
        System.out.println();

        System.out.println("=== IONDrink 정보 ===");
        IONDrink Ion = new IONDrink("포카리스웨트", "동아오츠카", "수분 보충", 500, 120, 1500, 750.0, 30, "레몬라임");
        Ion.showInfo();
        Ion.drink();
        System.out.println();

        System.out.println("=== Milk 정보 ===");
        Milk mil = new Milk("서울우유", "서울우유협동조합", "든든함", 1000, 600, 2800, 3.6, 30);
        mil.showInfo();
        mil.drink();
        System.out.println();

        System.out.println("=== Water 정보 ===");
        Water wat = new Water("삼다수", "제주특별자치도개발공사", "갈증 해소", 500, 0, 800, "제주", "2026-12-31", 500, 20);
        wat.showInfo();
        wat.drink();
        System.out.println();

        System.out.println("--- 모든 음료 정보 출력 완료 ---");
    }
}