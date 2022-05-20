package string;

public class StringTest2 {
    public static void main(String[] args) {
        String str1 = new String("java");
        String str2 = new String("is fun");
        String str3;

        System.out.println(str1);

        str3 = str1.concat(str2);   //문자열 열결 메서드 concat()
        System.out.println(str3);

    }
}
