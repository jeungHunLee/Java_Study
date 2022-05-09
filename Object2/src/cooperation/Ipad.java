package cooperation;

public class Ipad {
    String ipadModel;
    int saleCount;
    int price;

    public Ipad(String ipadModel) {
        this.ipadModel = ipadModel;
    }

    public void buyIpad(int price) {
        this.price += price;
        saleCount++;
    }

    public void showInfo() {
        System.out.println(ipadModel + " 판매량은 " + saleCount + "개 이고, 수입은 "
                + price + "달러 입니다.");
    }
}
