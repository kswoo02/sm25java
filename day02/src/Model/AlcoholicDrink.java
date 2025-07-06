package Model; // 패키지 선언: 이 클래스가 속한 패키지를 정의합니다.

public class AlcoholicDrink extends Drink { // 클래스 선언: AlcoholicDrink 클래스를 정의하며, Drink 클래스를 상속받습니다.

    // 어트리뷰트(Attribute) 또는 필드(Field): 객체의 상태(데이터)를 나타내는 변수들입니다.
    public double alcoholPercentage; // 알코올 도수를 저장하는 어트리뷰트
    public String origin;          // 원산지를 저장하는 어트리뷰트

    // 생성자(Constructor): 객체를 초기화하는 특별한 메서드와 같습니다.
    // 객체가 생성될 때(new AlcoholicDrink() 할 때) 호출됩니다.
    public AlcoholicDrink() { // 기본 생성자: 매개변수 없이 객체를 생성할 때 사용됩니다.
    }

    // 생성자 정의: 매개변수를 받아 객체의 속성들을 초기화하는 생성자입니다.
    public AlcoholicDrink(String name, String brande, String buff, int Volume, int cal, int price, double alcoholPercentage, String origin) {
        // super(...) : 부모 클래스(Drink)의 생성자를 호출하여,
        // name, brande, buff, Volume, cal, price 등의 공통적인 속성들을 초기화합니다.
        super(name, brande, buff, Volume, cal, price);

        // this.xyz = xyz : 현재 객체의 고유한 속성들(AlcoholicDrink 에만 있는 속성)을 초기화합니다.
        this.alcoholPercentage = alcoholPercentage;
        this.origin = origin;
    }

    // 메서드(Method): 객체가 수행할 수 있는 '행위' 또는 '동작'을 정의합니다.
    public void drink() { // drink 메서드 정의: 음료를 마시는 행위를 시뮬레이션합니다.
        this.Volume = 0; // 객체의 볼륨(Volume) 어트리뷰트를 0으로 설정합니다.
        System.out.println(name + "꺼억"); // 객체의 이름(name) 어트리뷰트를 사용하여 메시지를 출력합니다.
    }

    // 메서드(Method): 객체가 수행할 수 있는 또 다른 '행위'를 정의합니다.
    public void alcoholPercentage() { // alcoholPercentage 메서드 정의: 알코올 도수를 출력하는 행위를 정의합니다.
        System.out.println("알코올 도수: " + alcoholPercentage + "%"); // 객체의 alcoholPercentage 어트리뷰트를 출력합니다.
    }

    // 메서드(Method) 오버라이드(Override): 부모 클래스(Drink)의 추상 메서드를 재정의합니다.
    // @Override 어노테이션은 이 메서드가 부모 클래스의 메서드를 재정의함을 컴파일러에게 알려줍니다.
    @Override
    public void showInfo() { // showInfo 메서드 정의: 음료의 모든 정보를 출력하는 행위를 정의합니다.
        System.out.println("--- 음료 정보 (주류) ---");
        System.out.println("이름: " + this.name); // 객체의 name 어트리뷰트 출력
        System.out.println("브랜드: " + this.brande); // 객체의 brande 어트리뷰트 출력
        System.out.println("버프: " + this.buff);   // 객체의 buff 어트리뷰트 출력
        System.out.println("볼륨: " + this.Volume + "ml"); // 객체의 Volume 어트리뷰트 출력
        System.out.println("칼로리: " + this.cal + "kcal"); // 객체의 cal 어트리뷰트 출력
        System.out.println("가격: " + this.price + "원"); // 객체의 price 어트리뷰트 출력
        System.out.println("알코올 도수: " + this.alcoholPercentage + "%"); // AlcoholicDrink 고유 어트리뷰트 출력
        System.out.println("원산지: " + this.origin); // AlcoholicDrink 고유 어트리뷰트 출력
    }
}