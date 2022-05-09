package multidimension;

public class TwoDimension {
    public static void main(String[] args) {
        int[][] data = {{1, 2, 3}, {7, 8, 9}};  //2차원 배열 선언

        for(int i = 0; i < data.length; i++) {
            // data.length -> 행의 길이
            for(int j = 0; j < data[i].length; j++) {
                //data[i].length -> 열의 길이
                System.out.println(data[i][j]);
            }
            System.out.println();
        }
    }
}
