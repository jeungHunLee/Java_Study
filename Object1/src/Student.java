public class Student {
    private String studentName;     //정보 은닉
    int studentID;
    Subject math;   //Subject 클래스형 변수
    Subject programming;

    public Student() {
        math = new Subject();
        programming = new Subject();
    }

    //메서드
    public void setMath(String subjectName, int subjectScore) {
        math.subjectName = subjectName;
        math.subjectScore = subjectScore;
    }

    public void setProgramming(String subjectName, int subjectScore) {
        programming.subjectName = subjectName;
        programming.subjectScore = subjectScore;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }
}
