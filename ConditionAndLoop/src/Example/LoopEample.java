package Example;

public class LoopEample {
    public static void main(String[] args) {
        int starCount = 1;
        int blankCount = 3;
        int lineCount;

        for (lineCount = 1; lineCount <= 7 && starCount > 0; ) {
            for (int i = 1; i <= blankCount; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= starCount; i++) {
                System.out.print("*");
            }
            for (int i = 1; i <= blankCount; i++) {
                System.out.print(" ");
            }

            if (lineCount >= 4) {
                blankCount++;
                starCount -= 2;
            }

            else {
                blankCount--;
                starCount += 2;
            }

            lineCount++;
            System.out.println();
        }
    }
}
