package Freedom;

public class Overriding_Mid {
    public static void main(String[] args) {
        Overriding_Main parent = new Overriding_Main();
        Overriding_Main child = new Overriding_Sub();  // 업캐스팅

        parent.printMessage();  // 부모 메서드 호출
        child.printMessage();   // 오버라이딩된 자식 메서드 호출
    }
}
