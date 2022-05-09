package singleton;

public class Company {
    private static Company instance = new Company();    //유일한 인스턴스 생성
    private Company() {};

    public static Company getInstance() {
        //외부에서 인스턴스를 참조 할 수 있도록하는 메서드
        if(instance == null) {
            instance = new Company();
        }
        return instance;
    }
}
