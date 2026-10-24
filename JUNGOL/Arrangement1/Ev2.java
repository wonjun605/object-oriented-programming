import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }

        int sum = arr[0] + arr[2] + arr[4];
        System.out.println(sum);

        scanner.close();
    }
}
