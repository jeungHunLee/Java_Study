package collection.hashset;

import collection.Student;

public class StudentHashSetTest {
    public static void main(String[] args) {
        StudentHashSet studentHashSet = new StudentHashSet();

        Student studentLee = new Student("이철수", 1001);
        Student studentKim = new Student("김영희", 1002);
        Student studentSon = new Student("손다혜", 1003);
        Student studentPark = new Student("박찬영", 1004);

        studentHashSet.addStudent(studentLee);
        studentHashSet.addStudent(studentKim);
        studentHashSet.addStudent(studentSon);
        studentHashSet.addStudent(studentPark);

        studentHashSet.showAllStudent();

        studentHashSet.removeStudent("박찬영");
        studentHashSet.showAllStudent();

        Student studentSon2 = new Student("손다혜", 1003);
        studentHashSet.addStudent(studentSon2); //studentId가 같은 객체가 존재하므로 중복 불가
        studentHashSet.showAllStudent();

        Student studentKim2 = new Student("김영희", 1005);
        studentHashSet.addStudent(studentKim2); //studentName은 같지만 studentId가 다르므로 새로 추가
        studentHashSet.showAllStudent();
    }
}
