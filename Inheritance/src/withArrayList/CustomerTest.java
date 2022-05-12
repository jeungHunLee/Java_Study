package withArrayList;
import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<Customer>();

        Customer customerLee = new Customer(1010, "이철수");
        Customer customerPark = new Customer(1020, "박상민");
        Customer customerSon = new GoldCustomer(1030, "손수민");
        Customer customerKim = new VIPCustomer(1040, "김영희", 9999);
        Customer customerChoi = new VIPCustomer(1050, "최성민", 1234);

        customerList.add(customerLee);
        customerList.add(customerPark);
        customerList.add(customerSon);
        customerList.add(customerKim);
        customerList.add(customerChoi);

        System.out.println("=====고객정보=====");
        for(Customer customer : customerList) {
            System.out.println(customer.showInfo());
        }

        System.out.println("=====계산=====");
        int price = 20000;

        for(Customer customer : customerList) {
            int cost = customer.calcPrice(price);
            System.out.println(customer.getCustomerName() + " 님이" + cost + "원 지불하셨습니다.");
            System.out.println(customer.showInfo());
        }
    }
}