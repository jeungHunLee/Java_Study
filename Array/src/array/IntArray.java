package array;

public class IntArray {
    public static void main(String[] args) {
        int[] data = new int[10];

        for(int i = 0, j = 1; i < data.length; i++) {
            data[i] += j;
            j++;
        }

        for(int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
}
