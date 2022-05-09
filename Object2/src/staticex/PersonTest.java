package staticex;

public class PersonTest {
    public static void main(String[] args) {
        Person personLee = new Person();
        personLee.setPersonName("이철수");
        System.out.println(personLee.getPersonName() + "님의 대기번호는 "
                + Person.getWaitingNum() + "번 입니다.\n잠시만 기다려 주세요.");

        Person personKim = new Person();
        personKim.setPersonName("김영희");
        System.out.println(personKim.getPersonName() + "님의 대기번호는 "
                + Person.getWaitingNum() + "번 입니다.\n잠시만 기다려 주세요.");
    }
}