package collection.arraylist;

import java.util.ArrayList;
import collection.Student;

public class StudentArrayList {
    private ArrayList<Student> arrayList;

    public StudentArrayList() {
        this.arrayList = new ArrayList<Student>();
    }

    //학생 정보 추가 메서드
    public void addStudent(Student student) {
        arrayList.add(student);
    }

    //학생 정보 삭제 메서드
    public boolean removeStudent(String studentName) {
        for(int i = 0; i < arrayList.size(); i++) {
            Student student = arrayList.get(i);
            String name = student.getStudentName();
            if(name == studentName) {
                arrayList.remove(i);
                return true;
            }
        }
        //조건에 충족하는 이름이 없을 경우 실행
        System.out.println(studentName + "에 해당하는 학생의 정보가 없습니다.");
        return false;
    }

    //학생 정보 출력
    public void showAllMember() {
        for(Student student : arrayList) {
            System.out.println(student);
        }
        System.out.println();
    }
}

