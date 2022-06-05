package collection.map.hashmap;

import collection.Student;

public class StudentHashMapTest {
    public static void main(String[] args) {
        StudentHashMap studentHashMap = new StudentHashMap();

        Student studentLee = new Student("이철수", 1001);
        Student studentKim = new Student("김영희", 1002);
        Student studentSon = new Student("손다혜", 1003);
        Student studentPark = new Student("박찬영", 1004);

        studentHashMap.addStudent(studentLee);
        studentHashMap.addStudent(studentKim);
        studentHashMap.addStudent(studentSon);
        studentHashMap.addStudent(studentPark);

        studentHashMap.showAllStudent();

        studentHashMap.removeStudent("박찬영");    //"박찬영" key 값을 가진 요소 제거
        studentHashMap.showAllStudent();
    }
}
