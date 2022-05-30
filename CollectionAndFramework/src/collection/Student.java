package collection;

import java.util.Objects;

public class Student {
    private String studentName;
    private int studentId;

    public Student(String studentName, int studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String toString() {
        return studentName + " 학생의 학번은 " + studentId + "입니다.";
    }

    public int hashCode() {
        return studentId;
    }

    //studentId가 같으면 같은 객체로 판별하는 메서드
    public boolean equals(Object object) {
        if (object instanceof Student) {
            Student student = (Student) object;
            if (this.studentId == student.studentId) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}

