import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
            if (i % 2 == 0) {
                oddSum += arr[i];
            } else {
                evenSum += arr[i];
            }
        }

        System.out.println("odd : " + oddSum + " even : " + evenSum);

        scanner.close();
    }
}
