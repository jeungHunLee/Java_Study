package stream;

import java.util.Arrays;
import java.util.OptionalInt;

public class IntArrayStream {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int intSum = Arrays.stream(array).sum();            //  배열의 합 반환
        System.out.println(intSum);

        OptionalInt maxNum = Arrays.stream(array).max();    //배열의 최갯값 반환
        System.out.println(maxNum);
    }
}
