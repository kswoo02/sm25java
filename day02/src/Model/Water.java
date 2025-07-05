package Model;

public class Water extends Drink {

    public String sourceOfWater;
    public String expirationDate;
    public int volume;
    public int mineral;

    public Water() {
    }

    public Water(String name, String brande, String buff, int Volume, int cal, int price, String sourceOfWater, String expirationDate, int volume, int mineral) {
        super(name, brande, buff, Volume, cal, price);
        this.sourceOfWater = sourceOfWater;
        this.expirationDate = expirationDate;
        this.volume = volume;
        this.mineral = mineral;
    }

    public void drink() {
        this.Volume = 0;
        System.out.println(name+"배불");
    }

    public void mineral() {
        System.out.println("미네랄 함량: " + mineral + "mg");
    }

    @Override
    public void showInfo() {
        System.out.println("--- 음료 정보 (물) ---");
        System.out.println("이름: " + this.name);
        System.out.println("브랜드: " + this.brande);
        System.out.println("버프: " + this.buff);
        System.out.println("볼륨: " + this.Volume + "ml");
        System.out.println("칼로리: " + this.cal + "kcal");
        System.out.println("가격: " + this.price + "원");
        System.out.println("수원지: " + this.sourceOfWater);
        System.out.println("유통기한: " + this.expirationDate);
        System.out.println("개별 용량: " + this.volume + "ml");
        System.out.println("미네랄 함량: " + this.mineral + "mg");
    }
}