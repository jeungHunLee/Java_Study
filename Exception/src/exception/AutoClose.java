package exception;

public class AutoClose implements AutoCloseable {
    @Override
    //AutoCloseable을 구현한 클래스는 반드시 close메서드를 구현해야하며 close메서드는 자동으로 호출됨
    public void close() throws Exception {
        System.out.println("파일을 닫았습니다.");
    }
}
