package object;

class Student2 {
    int studentID;
    String studentName;

    public Student2(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public String toString() {
        return studentID + "," + studentName;
    }
    //equals() 메서드 재정의
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student2) {
            Student2 std = (Student2) obj;
            if(this.studentID == std.studentID)
                return true;
            else return false;
        }
        return false;
    }
    //해시값 재정의
    @Override
    public int hashCode() {
        return studentID;
    }
}

public class EqualTest {
    public static void main(String[] args) {
        Student2 studentLee = new Student2(12345, "이철수");
        Student2 studentChul = studentLee;
        Student2 studentKim = new Student2(13579, "김영희");

        if (studentLee == studentChul) {
            System.out.println("studentLee와 studentChul의 주소는 같습니다.");
        }
        else {
            System.out.println("studentLee와 studentChul의 주소는 다릅니다.");
        }

        if (studentLee.equals(studentChul)) {
            System.out.println("studentLee와 studentChul은 동일합니다.");
        }
        else {
            System.out.println("studentLee와 studentChul은 동일하지 않습니다.");
        }

        if(studentLee == studentKim) {
            System.out.println("studentLee와 studentKim의 주소는 같습니다.");
        }
        else {
            System.out.println("studenLee와 studentKim의 주소는 다릅니다.");
        }

        if (studentLee.equals(studentKim)) {
            System.out.println("studentLee와 studentKim은 동일합니다.");
        }
        else {
            System.out.println("studentLee와 studentKim은 동일하지 않습니다.");
        }

        System.out.println("studentLee의 hashCode: " + studentLee.hashCode());
        System.out.println("studentKim의 hashCode: " + studentKim.hashCode());

        System.out.println("studentLee의 실제 주소값: " + System.identityHashCode(studentLee));
        System.out.println("studentKim의 실제 주소값: " +System.identityHashCode(studentKim));
    }
}
