package inheritance;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer();
        customerLee.setCustomerID(1010);
        customerLee.setCustomerName("이철수");
        customerLee.bonusPoint = 1000;

        System.out.println(customerLee.showInfo());

        Customer customerKim = new VIPCustomer(1020, "김영희", 9999);
        customerKim.bonusPoint = 1000;

        System.out.println(customerKim.showInfo());

        System.out.println("=====계산=====");
        int price = 12000;
        int leePrice = customerLee.calcPrice(price);
        int kimPrice = customerKim.calcPrice(price);

        System.out.println(customerLee.getCustomerName() + " 님이" + leePrice + "원 지불하셨습니다.");
        System.out.println(customerLee.showInfo());
        System.out.println(customerKim.getCustomerName() + " 님이" + kimPrice + "원 지불하셨습니다.");
        System.out.println(customerKim.showInfo());

    }
}
