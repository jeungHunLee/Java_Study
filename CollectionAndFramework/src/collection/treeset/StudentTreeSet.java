package collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;
import collection.Student;

public class StudentTreeSet {
    private TreeSet<Student> treeSet;

    public StudentTreeSet() {
        this.treeSet = new TreeSet<Student>(new Student());
    }

    public void addStudent(Student student) {
        treeSet.add(student);
    }

    public boolean removeStudent(String studentName) {
        Iterator<Student> iterator = treeSet.iterator();

        while(iterator.hasNext()) {
            Student student = iterator.next();
            String name = student.getStudentName();
            if(name == studentName) {
                treeSet.remove(student);
                return true;
            } else {
                return false;
            }
        }
        System.out.println(studentName + "에 해당하는 학생 정보가 없습니다.");
        return false;
    }

    public void showAllStudent() {
        for(Student student : treeSet) {
            System.out.println(student);
        }
        System.out.println();
    }
}
