import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] ribbon = new int[n];

            for (int j = 0; j < n; j++) {
                ribbon[j] = scanner.nextInt();
            }

            boolean firstOne = false;
            int firstOneIndex = 0;
            int lastOneIndex = 0;

            for (int j = 0; j < n; j++) {
                if (!firstOne && ribbon[j] == 1) {
                    firstOne = true;
                    firstOneIndex = j;
                    lastOneIndex = j;
                } else if (ribbon[j] == 1) {
                    lastOneIndex = j;
                }
            }

            int minOperation = 0;
            for (int j = firstOneIndex; j <= lastOneIndex; j++) {
                if (ribbon[j] == 0) {
                    minOperation++;
                }
            }

            System.out.println(minOperation);
        }
    }

}