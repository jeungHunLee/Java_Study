package Condition;

public class If {
    public static void main(String[] args) {
        // if 조건문 연습

        int score = 78;

        if(score >= 90) {   //하나의 조건 만족시 나머지 조건은 확인 X
            System.out.println("A 학점입니다.");
        }
        else if(score >= 80) {
            System.out.println("B 학점입니다.");
        }
        else if(score >= 70) {
            System.out.println("C 학점입니다.");
        }
        else if(score >= 60) {
            System.out.println("D 학점입니다.");
        }
        else {
            System.out.println("F 학점입니다.");
        }
    }
}
