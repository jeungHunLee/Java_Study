package generics;

public class GenericBurgerTest {
    public static void main(String[] args) {
        //소고기 버거 생성
        GenericBurger<Beef> beefBurger = new GenericBurger<Beef>();

        beefBurger.setMaterial(new Beef());
        System.out.println(beefBurger);

        //치킨 버거 생성
        GenericBurger<Chicken> chickenBurger = new GenericBurger<Chicken>();

        chickenBurger.setMaterial(new Chicken());
        System.out.println(chickenBurger);

        //새우 버거 생성
        GenericBurger<Shrimp> shrimpBurger = new GenericBurger<Shrimp>();

        shrimpBurger.setMaterial(new Shrimp());
        System.out.println(shrimpBurger);
    }
}
