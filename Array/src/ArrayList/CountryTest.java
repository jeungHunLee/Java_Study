package ArrayList;
import java.util.ArrayList;     //ArrayList 클래스 import

public class CountryTest {
    public static void main(String[] args) {
        ArrayList<Country> data = new ArrayList<Country>();  //ArrayList 선언

        data.add(new Country("USA", 1));
        data.add(new Country("Republic Of Korea", 82));
        data.add(new Country("Japan", 81));
        data.add(new Country("china", 86));
        data.add(new Country("Australia", 61));

        for(int i = 0; i < data.size(); i++) {
            data.get(i).showInfo();
        }
        System.out.println();

        //향상된 for문
        for(Country  country : data) {
            country.showInfo();
        }
    }
}