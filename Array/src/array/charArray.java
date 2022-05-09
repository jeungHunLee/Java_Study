package array;

public class charArray {
    public static void main(String[] args) {
        char[] data = new char[26];     //char형 배열 선언
        char ch = 'A';

        for(int i = 0; i < data.length; i++, ch++) {
            data[i] += ch;
        }

        for(int i = 0; i < data.length; i++) {
             System.out.println(data[i] +  "," + (int)data[i]);
        }
    }
}
