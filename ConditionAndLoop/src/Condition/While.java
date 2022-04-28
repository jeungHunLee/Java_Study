package Condition;

public class While {
    public static void main(String[] args) {
        //while문 연습

        int sum = 0;
        int num = 1;

        while(num <= 100) {
            //num <= 100이 참일때 반복
            sum += num;
            num++;
        }

        System.out.println("1부터 100까지의 합은 " + sum + "입니다.");
    }
}
