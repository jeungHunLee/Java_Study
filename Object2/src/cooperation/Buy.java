package cooperation;

public class Buy {
    public static void main(String[] args) {
        Person personLee = new Person("이철수", 1200);
        Person personKim = new Person("김영희", 900);

        Iphone iphonePro = new Iphone("iphonePro13");
        personLee.takeIphone(iphonePro);
        personLee.showInfo();
        iphonePro.showInfo();

        Ipad ipadAir = new Ipad("ipadAir5");
        personKim.takeIpad(ipadAir);
        personKim.showInfo();
        ipadAir.showInfo();
    }
}

