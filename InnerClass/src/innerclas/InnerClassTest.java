package innerclas;

import jdk.dynalink.beans.StaticClass;

class OutClass {
    private String outStr = "외부 클래스의 인스턴스 변수입니다.";     //외부 클래스의 인스턴스 변수 선언
    private static String outStaticStr = "외부 클래스의 정적 변수입니다.";    //외부 클래스의 정적 변수 선언
    private InnerClass innerClass;

    public OutClass() {
        this.innerClass = new InnerClass();
    }

    //내부 클래스
    private class InnerClass {
        String innerStr1 = "내부 클래스의 인스턴스 변수입니다.";       //인스턴스 내부 클래스의 인스턴스 변수 선언
        //static String innerStaticStr1 = "내부 클래스의 정적 변수입니다.";      인스턴스 내부 클래스에 정적 변수 선언 불가

        void innerMethod() {
            System.out.println(outStr);
            System.out.println(innerStr1);
            System.out.println(outStaticStr);
        }

        //static void innerStaticMethod() {};   정적 메서드 구현 불가
    }

    static class staticInnerClass {     //외부 클래스 생성에 관계 없이 메모리에 할당
        String innerStr2 = "정적 내부 클래스의 인스턴스 변수입니다.";    //정적 내부 클래스의 인스턴스 변수 선언
        static String innerStaticStr2 = "정적 내부 클래스의 정적 변수입니다.";  //정적 내부 클래스의 정적 변수 선언

        void innerMethod() {
            System.out.println(innerStr2);
            System.out.println(outStaticStr);
            System.out.println(innerStaticStr2);
        }

        static void staticMethod() {   //정적 내부 클래스의 생서과 관계 없이 메모리에 할당
            System.out.println(innerStaticStr2);
            System.out.println(outStaticStr);
        }
    }

    public void innerPrint() {  //인스턴스 내부 클래스의 메서드를 수행하는 외부 메서드
        innerClass.innerMethod();
    }
}

public class InnerClassTest {
    public static void main(String[] args) {
        OutClass out = new OutClass();
        out.innerPrint();
        System.out.println();

        OutClass.staticInnerClass staticInnerClass = new OutClass.staticInnerClass();
        staticInnerClass.innerMethod();
        System.out.println();

        OutClass.staticInnerClass.staticMethod();
    }
}
