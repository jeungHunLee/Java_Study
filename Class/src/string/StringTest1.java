package string;

public class StringTest1 {
    public static void main(String[] args) {
        String str1 = new String("abc");    //객체 생성
        String str2 = new String("abc");    //객체 생성

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        String str3 = "abc";    //상수 풀에 존재하는 문자열 상수를 가리킴
        String str4 = "abc";

        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));
    }
}
