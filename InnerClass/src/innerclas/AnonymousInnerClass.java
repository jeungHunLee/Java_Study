package innerclas;

class Out2 {
    public Runnable getRunnable (int num) {
        int iNum = 1;

        //익명 내부 클래스 구현1(클래스 이름없이 구현)
        return new Runnable() {
            public void run() {
                System.out.println("iNum = " + iNum);
                System.out.println("num = " + num);
            }
        };  //익명 내부 클래스 종료를 알리기 위해 ';' 표시
    }

    //익명 내부 클래스 구현2(Runnalbe 클래스형 변수에 익명 내부 클래스 대입)
    Runnable runnable = new Runnable() {
        public void run() {
            System.out.println("변수에 익명 내부 클래스 대입");
        }
    };
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Out2 out = new Out2();
        Runnable runnable = out.getRunnable(7);
        runnable.run();
        out.runnable.run();
    }
}
