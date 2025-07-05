package Model;


public class AlcoholicDrink extends Drink {

    public double alcoholPercentage;
    public String origin;

    public AlcoholicDrink() {
    }

    public AlcoholicDrink(String name, String brande, String buff, int Volume, int cal, int price, double alcoholPercentage, String origin) {
        super(name, brande, buff, Volume, cal, price);
        this.alcoholPercentage = alcoholPercentage;
        this.origin = origin;
    }

    public void drink() {
        this.Volume = 0;
        System.out.println(name+"꺼억");
    }

    public void alcoholPercentage() {
        System.out.println("알코올 도수: " + alcoholPercentage + "%");
    }

    @Override
    public void showInfo() {
        System.out.println("--- 음료 정보 (주류) ---");
        System.out.println("이름: " + this.name);
        System.out.println("브랜드: " + this.brande);
        System.out.println("버프: " + this.buff);
        System.out.println("볼륨: " + this.Volume + "ml");
        System.out.println("칼로리: " + this.cal + "kcal");
        System.out.println("가격: " + this.price + "원");
        System.out.println("알코올 도수: " + this.alcoholPercentage + "%");
        System.out.println("원산지: " + this.origin);
    }
}