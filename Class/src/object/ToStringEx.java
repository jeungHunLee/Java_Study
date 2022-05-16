package object;

class Student {
    int studentID;
    String studentName;

    Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    //toString() 메서드 재정의
    @Override
    public String toString() {
        return studentID + ", " + studentName;
    }
}

public class ToStringEx {
    public static void main(String[] args) {
        Student studentLee = new Student(12345, "이철수");

        System.out.println(studentLee);              //toString 메서드 자동 호출
        System.out.println(studentLee.toString());   //toString() 메서드 호출
    }
}
