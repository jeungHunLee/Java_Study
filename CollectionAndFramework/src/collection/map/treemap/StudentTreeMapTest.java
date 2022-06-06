package collection.map.treemap;

import collection.Student;

public class StudentTreeMapTest {
    public static void main(String[] args) {
        StudentTreeMap studentTreeMap = new StudentTreeMap();

        Student studentLee = new Student("이철수", 1001);
        Student studentKim = new Student("김영희", 1002);
        Student studentSon = new Student("손다혜", 1003);
        Student studentPark = new Student("박찬영", 1004);

        studentTreeMap.addStudent(studentLee);      //String 클래스에 미리 정의 되어있는 equals 메서드를 통해 오름차순 정렬
        studentTreeMap.addStudent(studentKim);      //TreeMap에서 정렬 기준은 key값인 studentName
        studentTreeMap.addStudent(studentSon);
        studentTreeMap.addStudent(studentPark);
        studentTreeMap.showAllStudent();

        studentTreeMap.removeStudent("박찬영");    //"박찬영"이라는 key값의 요소 삭제
        studentTreeMap.showAllStudent();
    }
}
