import java.util.Arrays;
import java.util.Scanner;

public class Q_1095 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] num = new int[n];

        for(int i = 0; i < n; i++) {
            num[i] = scanner.nextInt();
        }
        scanner.close();

        Arrays.sort(num);

        System.out.println(num[0]);
    }
}
