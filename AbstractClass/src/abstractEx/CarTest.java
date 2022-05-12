package abstractEx;

public class CarTest {
    public static void main(String[] args) {
        Car genesis = new NormalCar();
        Car tesla = new AutopilotCar();

        System.out.println("=====내연기관 자동차=====");
        genesis.run();

        System.out.println("=====전기 자동차=====");
        tesla.run();
    }
}
