package exception;

public class ArrayException {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};    //크기가 5인 배열 선언

        try {
            arr[5] = 6;     //범위 외 인덱스에 요소 추가
        } catch(ArrayIndexOutOfBoundsException e) {     //예외가 발생하면 catch 블럭 실행
            System.out.println(e);
        }

        System.out.println("종료");
    }
}
