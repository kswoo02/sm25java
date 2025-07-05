package Model;

public class EnergyDrink extends Drink {

    public int caffeineAmount;
    public int taurineAmount;
    public int sugarAmount;

    public EnergyDrink() {
    }

    public EnergyDrink(String name, String brande, String buff, int Volume, int cal, int price, int caffeineAmount, int taurineAmount, int sugarAmount) {
        super(name, brande, buff, Volume, cal, price);
        this.caffeineAmount = caffeineAmount;
        this.taurineAmount = taurineAmount;
        this.sugarAmount = sugarAmount;
    }

    public void drink() {
        this.Volume = 0;
        System.out.println(name+"꺼억");
    }

    public void sugarAmount() {
        System.out.println("설탕 함량: " + sugarAmount + "mg");
    }

    @Override
    public void showInfo() {
        System.out.println("--- 음료 정보 (에너지 드링크) ---");
        System.out.println("이름: " + this.name);
        System.out.println("브랜드: " + this.brande);
        System.out.println("버프: " + this.buff);
        System.out.println("볼륨: " + this.Volume + "ml");
        System.out.println("칼로리: " + this.cal + "kcal");
        System.out.println("가격: " + this.price + "원");
        System.out.println("카페인 함량: " + this.caffeineAmount + "mg");
        System.out.println("타우린 함량: " + this.taurineAmount + "mg");
        System.out.println("설탕 함량: " + this.sugarAmount + "mg");
    }
}