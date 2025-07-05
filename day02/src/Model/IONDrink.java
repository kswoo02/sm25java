package Model;


public class IONDrink extends Drink {

    public double electrolyteAmount;
    public int sugarAmount;
    public String flavor;

    public IONDrink() {
    }

    public IONDrink(String name, String brande, String buff, int Volume, int cal, int price, double electrolyteAmount, int sugarAmount, String flavor) {
        super(name, brande, buff, Volume, cal, price);
        this.electrolyteAmount = electrolyteAmount;
        this.sugarAmount = sugarAmount;
        this.flavor = flavor;
    }

    public void drink() {
        this.Volume = 0;
        System.out.println(name+"꺼억 후우 ");
    }

    public void flavor() {
        System.out.println("맛: " + flavor);
    }

    @Override
    public void showInfo() {
        System.out.println("--- 음료 정보 (이온 음료) ---");
        System.out.println("이름: " + this.name);
        System.out.println("브랜드: " + this.brande);
        System.out.println("버프: " + this.buff);
        System.out.println("볼륨: " + this.Volume + "ml");
        System.out.println("칼로리: " + this.cal + "kcal");
        System.out.println("가격: " + this.price + "원");
        System.out.println("전해질 함량: " + this.electrolyteAmount + "mg");
        System.out.println("설탕 함량: " + this.sugarAmount + "mg");
        System.out.println("맛: " + this.flavor);
    }
}