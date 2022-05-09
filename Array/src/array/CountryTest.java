package array;

public class CountryTest {
    public static void main(String[] args) {
        Country[] data = new Country[5];

        data[0] = new Country("USA", 1);
        data[1] = new Country("Republic Of Korea", 82);
        data[2] = new Country("Japan", 81);
        data[3] = new Country("China", 86);
        data[4] = new Country("Australia", 61);

        for(int i = 0; i < data.length; i++) {
            data[i].showInfo();
        }
    }
}
