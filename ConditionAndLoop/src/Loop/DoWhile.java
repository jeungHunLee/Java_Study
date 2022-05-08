package Loop;

public class DoWhile {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;

        do {
            sum += num;
            num++;
        } while (num <= 100);

        System.out.println("1부터 100까지의 합은" + sum + "입니다.");
    }
}
