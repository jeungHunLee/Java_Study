package interfaceEx;

public class CalculatorTest {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 2;

        CompleteCalc calc = new CompleteCalc();
        System.out.println(calc.add(num1, num2));
        System.out.println(calc.sub(num1, num2));
        System.out.println(calc.mul(num1, num2));
        System.out.println(calc.div(num1, num2));
        calc.description();

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Calc.total(arr));    //정적 메서드는 인터페이스 이름으로 직접 참조
    }
}
