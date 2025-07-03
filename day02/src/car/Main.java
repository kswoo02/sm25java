package car;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start Aplication...");
        Car car = new Car();
        car.go();
        car.stop();

        // 파라미터 이름 없이 값만 순서대로 전달한다
        Car car1 = new Car("k1", "red", 1000);
        car1.go();
        car1.stop();

        System.out.println("End Aplication...");
    }
}