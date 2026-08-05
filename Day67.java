import java.util.Arrays;
import java.util.Scanner;

public class GukizAndContest_551A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            int[] scores = new int[n];
            int[] sorted = new int[n];

            for (int i = 0; i < n; i++) {
                scores[i] = sc.nextInt();
                sorted[i] = scores[i];
            }

            Arrays.sort(sorted);

            for (int i = 0; i < n; i++) {
                int rank = 1;
                for (int j = n - 1; j >= 0; j--) {
                    if (sorted[j] > scores[i]) {
                        rank++;
                    } else {
                        break;
                    }
                }
                System.out.print(rank + " ");
            }
    }
}
