package string;

public class StringBuilderTest {
    public static void main(String[] args) {
        String str1 = new String("java");
        StringBuilder buffer = new StringBuilder(str1);     //StringBuilder 생성

        buffer.append(" makes");    //문자열 추가
        buffer.append(" me");
        buffer.append(" happy!!");

        str1 = buffer.toString();   //StringBuilder 클래스를 다시 String 클래스로 변환
        System.out.println(str1);
    }
}
