public class Operation2 {
    public static void main(String[] args) {
        //증감 연산자 연습

        int point1 = 100;

        int point2 = ++point1;      //증가 후 변수 대입
        System.out.println(point2);
        int point3 = point2++;      //대입 후 증가
        System.out.println(point3);

        int num1 = 10;

        int num2 = --num1;      //감소 후 대입
        System.out.println(num2);
        int num3 = num2--;      //대입 후 감소
        System.out.println(num3);

    }
}
