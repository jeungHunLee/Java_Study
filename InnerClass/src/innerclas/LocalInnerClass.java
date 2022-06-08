package innerclas;

class Out1 {
    int outNum = 100;   //인스턴스 변수
    static int sOutNum = 200;   //정적 변수

    //지역 내부 클래스
    public Runnable getRunnable(int num) {  //Runnable은 java.lang 패키지에 선언되어 있는 인터페이스
        int iNum = 1;                       //반드시 run() 메서드를 구현해야함

        class InnerRunnable implements Runnable {
            //outNum = 150; 외부 클래스 인스턴스 변수 변경 불가
            //num = 150; 매개변수 변경 불가
            public void run() {
                System.out.println("num = " + num);
                System.out.println("outNum = " + outNum);
                System.out.println("sOutNum = " + Out1.sOutNum);
                System.out.println("iNum = " + iNum);
            }
        }
        return new InnerRunnable();
    }

}

public class LocalInnerClass {
    public static void main(String[] args) {
        Out1 out = new Out1();
        Runnable runnable = out.getRunnable(10);
        runnable.run();
    }
}
