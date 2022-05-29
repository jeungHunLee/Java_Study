package collection.arraylist;

import java.util.ArrayList;

class MyQueue {
    ArrayList<Integer> myQueue = new ArrayList<Integer>();

    //큐 요소 저장
    public void enQueue(Integer data) {
        myQueue.add(data);
    }

    //큐 요소 추출
    public Integer deQueue() {
        int len = myQueue.size();
        if(len == 0) {
            System.out.println("큐가 비었습니다.");
        }

        return myQueue.remove(0);
    }
}

public class QueueArrayListTest {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();

        myQueue.enQueue(1);
        myQueue.enQueue(2);
        myQueue.enQueue(3);
        myQueue.enQueue(4);

        System.out.println(myQueue.deQueue());
        System.out.println(myQueue.deQueue());
        System.out.println(myQueue.deQueue());
        System.out.println(myQueue.deQueue());
    }
}
