public class Operation3 {
    public static void main(String[] args) {
        //관계 연산자, 논리 연산자 연습

        int a = 10;
        int b = 5;

        boolean value1 = ((a = a + 5) < 10 && (b = b - 1) > 0 ); //두 항이 모두 참일때 참
        System.out.println(value1);
        System.out.println(a);
        System.out.println(b);  //첫 항이 거짓이므로 두번째 항은 실행되지 않음

        boolean value2 = ((a = a + 5) > 10 || (b = b - 1) > 0); //두 항 중 하나만 참이면 모두 참
        System.out.println(value2);
        System.out.println(a);
        System.out.println(b);  //첫 항이 참이므로 두번째 항은 실행되지 않음

        //복합 대입 연산자 연습
        int n1 = 25;
        int n2 = 50;
        int n3 = 53;
        int n4 = 212;
        int n5 = 217;

        n1 += 10;
        n2 -= 20;
        n3 *= 2;
        n4 /= 4;
        n5 %= 6;

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);

        //조건 연산자 연습
        int myHeight = 173;

        boolean bool;
        bool = (myHeight == 173) ? true : false;    //조건식 ? 참 : 거짓

        System.out.println(bool);

        //연산자 우선순위
        //단항 연산자 > 이항 연산자 > 삼항 연산자
        //대입 연산자가 우선순위 가장 낮음
        //산술 > 관계 > 논리 > 대입 연산자 순
    }
}
