import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[100];
        int count = 0;

        while (true) {
            int input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            arr[count] = input;
            count++;
        }

        int start = 0;
        if (count >= 3) {
            start = count - 3;
        }

        for (int i = start; i < count; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}
