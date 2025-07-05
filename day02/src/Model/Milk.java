package Model;


public class Milk extends Drink {

    public double fatPercentage;
    public int proteinAmount;

    public Milk() {
    }

    public Milk(String name, String brande, String buff, int Volume, int cal, int price, double fatPercentage, int proteinAmount) {
        super(name, brande, buff, Volume, cal, price);
        this.fatPercentage = fatPercentage;
        this.proteinAmount = proteinAmount;
    }

    public void drink() {
        this.Volume = 0;
        System.out.println(name+"밀크 꺼~억");
    }

    public void proteinAmount() {
        System.out.println("단백질 함량: " + proteinAmount + "mg");
    }

    @Override
    public void showInfo() {
        System.out.println("--- 음료 정보 (우유) ---");
        System.out.println("이름: " + this.name);
        System.out.println("브랜드: " + this.brande);
        System.out.println("버프: " + this.buff);
        System.out.println("볼륨: " + this.Volume + "ml");
        System.out.println("칼로리: " + this.cal + "kcal");
        System.out.println("가격: " + this.price + "원");
        System.out.println("지방 함량: " + this.fatPercentage + "%");
        System.out.println("단백질 함량: " + this.proteinAmount + "mg");
    }
}