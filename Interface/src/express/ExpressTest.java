package express;

import java.io.IOException;

public class ExpressTest {
    public static void main(String[] args) throws IOException {
        System.out.println("배송 종류를 선택하세요");
        System.out.println("Q: 빠른 배송");
        System.out.println("N: 일반 배송");

        int ch = System.in.read();
        Express express = null;

        if (ch == 'Q' || ch == 'q') {
            express = new QuickExpress();
        }
        else if (ch == 'N' || ch == 'n') {
            express = new NormalExpress();
        }
        else {
            System.out.println("지원하지 않는 기능입니다.");
        }

        express.delivery();
        express.arrive();
    }
}
