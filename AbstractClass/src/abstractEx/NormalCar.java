package abstractEx;

public class NormalCar extends Car{
    public void drive() {
        System.out.println("사람이 직접 운전합니다.");
    }

    public void refuel() {
        System.out.println("휘발유로 주유합니다.");
    }
}
