package collection.treeset;

import collection.Student;

public class StudentTreeSetTest {
    public static void main(String[] args) {
        StudentTreeSet studentTreeSet = new StudentTreeSet();

        Student studentLee = new Student("이철수", 1001);
        Student studentKim = new Student("김영희", 1002);
        Student studentSon = new Student("손다혜", 1003);
        Student studentPark = new Student("박찬영", 1004);

        studentTreeSet.addStudent(studentLee);
        studentTreeSet.addStudent(studentKim);
        studentTreeSet.addStudent(studentSon);
        studentTreeSet.addStudent(studentPark);
        studentTreeSet.showAllStudent();
    }
}
