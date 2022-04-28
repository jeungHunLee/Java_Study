package Condition;

public class For {
    public static void main(String[] args) {
        //중첩된 for문을 이용한 구구단 출력
        for(int i = 2; i < 10; i ++) {
            for(int j = 1; j < 10; j++) {
                System.out.println(i + " X " + j + " = " + i * j);
            }
        }

        //continue문을 이용한 예외 처리
        int sum = 0;

        for(int i = 1; i <= 100; i++) {
            if(i % 3 == 0)  //3의 배수는 제외
                continue;
            else
                sum += i;
        }

        System.out.println(sum);

        //break를 이용한 for문 탈출
        int total = 0;
        int num = 1;

        for(num = 1; ; num++) {
            //조건식은 아래의 if문으로 대체
            total += num;
            if(total >= 100)
                break;
        }

        System.out.println("total: " + total);
        System.out.println("num: " + num);

    }
}
