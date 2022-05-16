package inheritance;

public class MyClass implements NewInterface{
    @Override
    public void a() {
        System.out.println("a() 메서드 입니다.");
    }

    @Override
    public void b() {
        System.out.println("b() 메서드 입니다.");
    }

    @Override
    public void newMethod() {
        System.out.println("newMethod() 메서드 입니다.");
    }
}
