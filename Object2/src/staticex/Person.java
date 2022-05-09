package staticex;

public class Person {
    private static int waitingNum = 0;   //정적변수 선언
    public String personName;

    public Person() {
        waitingNum++;
    }

    //static 메서드
    public static void setWaitingNum(int waitingNum) {
        Person.waitingNum = waitingNum;
    }

    public static int getWaitingNum() {
        return waitingNum;
    }

    //메서드
    public void setPersonName(String name) {
        this.personName = name;
    }

    public String getPersonName() {
        return personName;
    }
}
