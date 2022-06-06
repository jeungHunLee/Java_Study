package collection.map.treemap;

import java.util.Iterator;
import java.util.TreeMap;
import collection.Student;

public class StudentTreeMap {
    private TreeMap<String, Student> treeMap;

    public StudentTreeMap() {
        this.treeMap = new TreeMap<String, Student>();
    }

    public void addStudent(Student student) {
        treeMap.put(student.getStudentName(), student);
    }

    public boolean removeStudent(String studentName) {
        if(treeMap.containsKey(studentName)) {
            treeMap.remove(studentName);
            return true;
        }
        System.out.println(studentName + "학생은 존재하지 않습니다.");
        return false;
    }
    public void showAllStudent() {
        Iterator<String> iterator = treeMap.keySet().iterator();
        while(iterator.hasNext()) {
            String key = iterator.next();
            Student student = treeMap.get(key);
            System.out.println(student);
        }
        System.out.println();
    }
}
