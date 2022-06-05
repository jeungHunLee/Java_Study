package collection.map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import collection.Student;

public class StudentHashMap {
    private HashMap<String, Student> hashMap;

    public StudentHashMap() {
        this.hashMap = new HashMap<String, Student>();  //key = studentName, value = student
    }

    public void addStudent(Student student) {
        hashMap.put(student.getStudentName(), student);
    }

    public boolean removeStudent(String studentName) {
        if(hashMap.containsKey(studentName)) {  //hashMap이 studentName을 key로 가지고 있다면
            hashMap.remove(studentName);    //hashMap에서 studentName 삭제
            return true;
        }
        System.out.println(studentName + "학생은 존재하지 않습니다.");
        return false;
    }

    public void showAllStudent() {
        Iterator<String> iterator = hashMap.keySet().iterator();    //key 집합으로부터 iterator 발생
        while(iterator.hasNext()) {
            String key = iterator.next();   //key 변수에 key 값을 저장
            Student student = hashMap.get(key);     //key 값으로 value 값 가져오기
            System.out.println(student);
        }
        System.out.println();
    }
}
