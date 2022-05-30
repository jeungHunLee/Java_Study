package collection.arraylist;

import collection.Student;

public class StudentArrayListTest {
    public static void main(String[] args) {
       StudentArrayList studentArrayList = new StudentArrayList();

       Student studentLee = new Student("이철수", 1001);
       Student studentKim = new Student("김영희", 1002);
       Student studentSon = new Student("손다혜", 1003);
       Student studentPark = new Student("박찬영", 1004);

       studentArrayList.addStudent(studentLee);
       studentArrayList.addStudent(studentKim);
       studentArrayList.addStudent(studentSon);
       studentArrayList.addStudent(studentPark);

       studentArrayList.showAllStudent();

       //학생 정보 삭제
       studentArrayList.removeStudent("손다혜");
       studentArrayList.showAllStudent();
    }
}

