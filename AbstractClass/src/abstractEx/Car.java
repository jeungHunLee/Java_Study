package abstractEx;

//추상 클래스 선언
public abstract class Car {
    //추상 메서드
    public abstract void drive();
    public abstract void refuel();


    public void startCar() {
        System.out.println("시동을 겁니다.");
    }

    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    //템플릿 메서드
    final public void run() {
        startCar();
        drive();
        refuel();
        turnOff();
    }
}
