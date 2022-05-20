package classExample;

public class NewInstanceTest {
    public static void main(String[] args) throws ClassNotFoundException
            , InstantiationException, IllegalAccessException{
        Student studentLee = new Student();
        System.out.println(studentLee);

        Class a = Class.forName("classExample.Student");
        Student studentKim = (Student)a.newInstance();
        System.out.println(studentKim);
    }
}
