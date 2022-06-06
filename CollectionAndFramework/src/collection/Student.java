package collection;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student>, Comparator<Student> {
    private String studentName;
    private int studentId;

    public Student() {}

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
                //새로 추가하는 객체의 studentId와 기존에 존재하는 객체의 studentId를 비교
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    //TreeSet에서 compareTo 메서드를 사용하여 오름차순 정렬(Comparable)
    @Override
    public int compareTo(Student student) {
        return (this.studentName.compareTo(student.studentName));
    }

    //TreeSet에서 compare 메서드를 사용하여 내림차순 정렬(Comparator)
    public int compare(Student student1, Student student2) {
        return (student1.getStudentId() - student2.getStudentId()) * (-1);
    }
}