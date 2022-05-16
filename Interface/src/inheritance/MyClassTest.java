package inheritance;

public class MyClassTest {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        A aClass = myClass;     //상위 인터페이스형으로 선언
        aClass.a();             //상위 인터페이스에 선언한 메서드만 호출 가능

        B bClass = myClass;
        bClass.b();

        NewInterface nClass = myClass;
        nClass.a();     //상속 받은 인터페이스의 모든 메서드 호출 가능
        nClass.b();
        nClass.newMethod();
    }
}
