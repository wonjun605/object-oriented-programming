import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[100];
        int count = 0;

        while (true) {
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            arr[count] = input;
            count++;
        }

        System.out.println(count);

        for (int i = 0; i < count; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print((arr[i] * 2) + " ");
            } else {
                System.out.print((arr[i] / 2) + " ");
            }
        }

        scanner.close();
    }
}
