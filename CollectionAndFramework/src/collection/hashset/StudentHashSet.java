package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;
import collection.Student;

public class StudentHashSet {
    private HashSet<Student> hashSet;

    public StudentHashSet() {
        this.hashSet = new HashSet<Student>();
    }

    //학생 정보 추가
    public void addStudent(Student student) {
        hashSet.add(student);
    }

    //Iterator를 사용하여 학생 정보 삭제
    public boolean removeStudent(String studentName) {
        Iterator<Student> iterator = hashSet.iterator();
        while(iterator.hasNext()) {
            Student student = iterator.next();
            String name = student.getStudentName();
            if(name == studentName) {
                hashSet.remove(student);
                return true;
            }
        }
        System.out.println(studentName + "에 해당하는 학생 정보가 없습니다.");
        return false;
    }

    public void showAllStudent() {
        for(Student student : hashSet) {
            System.out.println(student);
        }
        System.out.println();
    }
}

