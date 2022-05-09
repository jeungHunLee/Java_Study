package cooperation;

public class Iphone {
    String iphoneModel;
    int saleCount;
    int price;

    public Iphone(String iphoneModel) {
        this.iphoneModel = iphoneModel;
    }

    public void buyIphone(int price) {
        this.price += price;
        saleCount++;
    }

    public void showInfo() {
        System.out.println(iphoneModel + " 판매량은 " + saleCount + "개 이고, 수입은 "
                + price + "달러 입니다.");
    }
}
