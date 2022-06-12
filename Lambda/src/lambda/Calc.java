package lambda;

public class Calc {
    public static void main(String[] args) {
        //람다식을 인터페이스 변수에 대입
        Add numbers = (num1, num2) -> System.out.println(num1 + num2);
        numbers.addNum(10, 20);

        //자바는 객체지향 언어로 참조 없이 메서드 호출 불가능
        //따라서 내부에서는 아래와 같은 익명 내부 클래스가 형성됨
        Add numbers2 = new Add() {

            @Override
            public void addNum(int num1, int num2) {
                System.out.println(num1 + num2);
            }
        };

    }
}
