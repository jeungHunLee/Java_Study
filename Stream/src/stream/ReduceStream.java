package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareNum implements BinaryOperator<Integer> {
    @Override
    public Integer apply(Integer i1, Integer i2) {
        if(i1 <= i2)        //전달 받은 매개변수 중 더 작은 값을 반환
            return i1;
        else return i2;
    }
}

public class ReduceStream {
    public static void main(String[] args) {

        Integer[] numbers = {1, 10, 100, 1000, 10000};

        //람다식을 직접 구현하는 방법
        System.out.println(Arrays.stream(numbers).reduce(0, (i1, i2) -> {
            if(i1 >= i2)    //전달 받은 매개변수 중 가장 큰 값을 반환
                return i1;
            else return i2;
        }));

        //람다식을 BinaryOperator 인터페이스를 구현한 클래스를 생성하는 방법
        Integer minNum = Arrays.stream(numbers).reduce(new CompareNum()).get();     //reduce에 인스턴스를 넣으면 자동으로 apply메서드 실행
        System.out.println(minNum);
    }
}
