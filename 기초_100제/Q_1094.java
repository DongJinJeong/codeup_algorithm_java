import java.util.Scanner;

public class Q_1094 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] pn = new int[n];

        for(int i = 0; i < n; i++) {
            pn[i] = scanner.nextInt();
        }

        for(int i = n - 1; i >= 0; i--) {
            System.out.print(pn[i] + " ");
        }
        scanner.close();
    }
}
