public class IncreaseDecrease {
    public static void main(String[] args) {
        int point1 = 100;

        int point2 = ++point1;      //증가 후 변수 대입
        System.out.println(point2);
        int point3 = point2++;      //대입 후 증가
        System.out.println(point3);

        int value1 = 10;

        int value2 = --value1;      //감소 후 대입
        System.out.println(value2);
        int value3 = value2--;      //대입 후 감소
        System.out.println(value3);

    }
}
