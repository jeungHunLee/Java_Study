package cooperation;

public class Person {
    public String personName;
    public int money;

    public Person(String personName, int money) {
        this.personName = personName;
        this.money = money;
    }

    public void takeIphone(Iphone iphone) {
        iphone.buyIphone(999);
        this.money -= 999;
    }

    public void takeIpad(Ipad ipad) {
        ipad.buyIpad(599);
        this.money -= 599;
    }

    public void showInfo() {
        System.out.println(personName + "님의 남은 돈은 "
                + money + "달러 입니다.");
    }
}
