package classExample;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Student studentLee = new Student();
        Class a = studentLee.getClass();   //getClass() 메서드
        System.out.println(a.getName());

        Class b = Student.class;   //클래스 파일명으로 직접 대입
        System.out.println(b.getName());

        Class c = Class.forName("classExample.Student");   //클래스 이름으로 가져오기
        System.out.println(c.getName());
    }
}
