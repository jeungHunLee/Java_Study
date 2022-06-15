package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStream {
    public static void main(String[] args) {
        List<String> language =  new ArrayList<String>();   //List는 ArrayList의 상위 클래스
        language.add("Java");
        language.add("Kotlin");
        language.add("JavaScript");

        Stream<String> stream = language.stream();          //생성된 스트림은 language에 관한 모든 요소를 가지고 있음
        stream.forEach(s -> System.out.print(s + " "));     //스트림에서 요소를 하나씩 출력
        System.out.println();

        //요소를 알파벳 순으로 정렬하여 출력
        language.stream().sorted().forEach(s -> System.out.print(s + " "));     //새로운 스트림 생성
    }
}
