package collection;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>(); //링크드 리스트 생성

        linkedList.add(1);  //링크드 리스트에 요소 '1'추가
        linkedList.add(3);  //링크드 리스트에 요소 '3'추가
        linkedList.add(5);  //링크드 리스트에 요소 '5'추가
        System.out.println(linkedList);

        linkedList.add(1, 2);   //index 위치 1에 요소 '2' 추가하기
        System.out.println(linkedList);

        linkedList.removeLast();    //링크드 리스트의 마지막 요소 삭제
        System.out.println(linkedList);
    }
}
