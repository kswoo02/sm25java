package Model;


public class Coffeeeeee extends Drink {

    public double caffeineAmount;
    public String beanOrigin;
    public String roastLevel;

    public Coffeeeeee() {
    }

    public Coffeeeeee(String name, String brande, String buff, int Volume, int cal, int price, double caffeineAmount, String beanOrigin, String roastLevel) {
        super(name, brande, buff, Volume, cal, price);
        this.caffeineAmount = caffeineAmount;
        this.beanOrigin = beanOrigin;
        this.roastLevel = roastLevel;
    }

    public void drink() {
        this.Volume = 0;
        System.out.println(name+"좋다");
    }

    public void roastLevel() {
        System.out.println("로스팅 레벨: " + roastLevel);
    }

    @Override
    public void showInfo() {
        System.out.println("--- 음료 정보 (커피) ---");
        System.out.println("이름: " + this.name);
        System.out.println("브랜드: " + this.brande);
        System.out.println("버프: " + this.buff);
        System.out.println("볼륨: " + this.Volume + "ml");
        System.out.println("칼로리: " + this.cal + "kcal");
        System.out.println("가격: " + this.price + "원");
        System.out.println("카페인 함량: " + this.caffeineAmount + "mg");
        System.out.println("원두 원산지: " + this.beanOrigin);
        System.out.println("로스팅 레벨: " + this.roastLevel);
    }
}