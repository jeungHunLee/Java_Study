package array;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {100, 200, 300, 400, 500};

        System.arraycopy(arr1, 0, arr2, 1, 3);
        //System.arraycopy(복사할 배열, 복사할 위치, 붙여넣을 배열, 붙여넣을 첫 위치, 복사할 요소 개수)

        for(int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
