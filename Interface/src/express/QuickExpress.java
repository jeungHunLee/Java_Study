package express;

public class QuickExpress implements Express {
    @Override
    public void delivery() {
        System.out.println("택배가 퀵배송으로 배달됩니다.");
    }

    @Override
    public void arrive() {
        System.out.println("내일까지 도착이 보장됩니다.");
    }
}
