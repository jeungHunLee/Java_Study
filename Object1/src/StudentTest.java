public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student();

        studentLee.setStudentName("이철수");
        studentLee.studentID = 1234567;
        studentLee.math.subjectName = "이산수학";
        studentLee.math.subjectScore = 88;
        studentLee.programming.subjectName = "Java 프로그래밍";
        studentLee.programming.subjectScore = 75;

        System.out.println("학생 이름: " + studentLee.getStudentName());
        System.out.println("학번: " + studentLee.studentID);
        System.out.println("이수과목: " + studentLee.math.subjectName + ", "
                + studentLee.programming.subjectName);
        System.out.println("총점: " + (studentLee.math.subjectScore
                + studentLee.programming.subjectScore));
    }
}

