package exception;

public class AutoClassTest {
    public static void main(String[] args) {
        try(AutoClose obj = new AutoClose()) {
            //실행문
            //close메서드를 명시적으로 호출하지 않아도 자동으로 호출
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
