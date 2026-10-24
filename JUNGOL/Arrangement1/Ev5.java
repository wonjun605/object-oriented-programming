import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] arr = new double[6];
        double sum = 0;

        for (int i = 0; i < 6; i++) {
            arr[i] = scanner.nextDouble();
            sum += arr[i];
        }

        double avg = sum / 6.0;
        System.out.printf("%.1f\n", avg);

        scanner.close();
    }
}
