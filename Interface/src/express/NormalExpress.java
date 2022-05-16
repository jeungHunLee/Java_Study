package express;

public class NormalExpress implements Express {
    @Override
    public void delivery() {
        System.out.println("택배가 일반 배송으로 배달됩니다.");
    }

    @Override
    public void arrive() {
        System.out.println("이번주까지 도착이 보장됩니다.");
    }
}
