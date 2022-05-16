package interfaceEx;

public interface Calc {
   int ERROR = -999999999;

    //메서드 선언
    int add(int num1, int num2);
    int sub(int num1, int num2);
    int mul(int num1, int num2);
    int div(int num1, int num2);

    //디폴트 메서드 구현
    default void description() {
     System.out.println("계산이 모두 완료되었습니다.");
    }

    //정적 메서드 구현
    static int total(int[] arr) {
     int total = 0;

     for(int i : arr) {
      total += i;
     }
     return total;
    }
}
