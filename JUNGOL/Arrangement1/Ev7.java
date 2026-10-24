import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[100];
        int count = 0;

        while (true) {
            int input = scanner.nextInt();
            if (input == 999) {
                break;
            }
            arr[count] = input;
            count++;
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < count; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("max : " + max);
        System.out.println("min : " + min);

        scanner.close();
    }
}
