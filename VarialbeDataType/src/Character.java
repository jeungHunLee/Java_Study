public class Character {
    public static void main(String[] args) {
        char c1 = 'Z';
        System.out.println(c1);         //c1 문자 출력
        System.out.println((int)c1);    //변수 c1에 해당하는 아스키코드값 출력

        int c2 = 88;
        System.out.println(c2);         //int형 변수 c2출력
        System.out.println((char)c2);   //int형 변수를 char형으로 출력

        int a = 65;
        int b = -65;

        char a1 = 65;
        // char b1 = -65
        //char 형은 음수 값을 표현할 수 없다

        System.out.println((char)a);
        System.out.println((char)b); //변수 b의 값이 음수이므로 결과값을 알 수 없음
        System.out.println(a1);
    }
}
