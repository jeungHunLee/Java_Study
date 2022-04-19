public class TypeInference {
    public static void main(String[] args) {
        var a = 1;      //변수 a의 타입이 int형으로 컴파일
        var b = 3.14;   //변수 b의 타입이 double형으로 컴파일
        var c = "test"; //변수 c의 타입이 String형응로 컴파일

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        c = "hello_World";  //다른 문자열은 대입 가능, 정수 or 실수 등은 대입 불가능
    }
}
