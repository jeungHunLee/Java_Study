package array;

public class CountryCopyTest {
    public static void main(String[] args) {
        Country[] data1 = new Country[5];
        Country[] data2 = new Country[5];

        data1[0] = new Country("USA", 1);
        data1[1] = new Country("Republic Of Korea", 82);
        data1[2] = new Country("Japan", 81);
        data1[3] = new Country("China", 86);
        data1[4] = new Country("Australia", 61);

        //객체 배열 깊은 복사
        data2[0] = new Country();   //새로운 인스턴스 생성
        data2[1] = new Country();
        data2[2] = new Country();
        data2[3] = new Country();
        data2[4] = new Country();

        for(int i = 0; i < data2.length; i++) {
            data2[i].setCountryName(data1[i].getCountryName());
            data2[i].setCountryCode(data1[i].getCountryCode());
        }

        data1[2].setCountryName("United Kingdom");
        data1[2].setCountryCode(44);

        for(int i = 0; i < data1.length; i++) {
            data1[i].showInfo();
        }
        System.out.println();

        for(int i = 0; i < data2.length; i++) {
            data2[i].showInfo();
        }
    }
}
