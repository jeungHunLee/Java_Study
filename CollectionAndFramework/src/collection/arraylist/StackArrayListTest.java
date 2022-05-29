package collection.arraylist;

import java.util.ArrayList;

class MyStack {
    private ArrayList<Integer> myStack = new ArrayList<Integer>();

    //스택에 요소 저장
    public void push(Integer data) {
        myStack.add(data);
    }

    //스택 요소 추출
    public Integer pop() {
        int len = myStack.size();
        if(len == 0) {
            System.out.println("스택이 비었습니다.");
        }

        return myStack.remove(len - 1);
    }
}

public class StackArrayListTest {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();

        myStack.push(1);    //스택에 데이터 삽입
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);

        System.out.println(myStack.pop());  //스택의 요소 차례로 추출
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());

        System.out.println(myStack.pop());  //스택이 비었으므로 오류 발생

    }
}
