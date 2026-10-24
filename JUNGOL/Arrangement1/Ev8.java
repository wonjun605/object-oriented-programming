import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;

        while (true) {
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            if (input % 5 == 0) {
                count++;
                sum += input;
            }
        }

        double avg = 0.0;
        if (count > 0) {
            avg = (double) sum / count;
        }

        System.out.println("Multiples of 5 : " + count);
        System.out.println("sum : " + sum);
        System.out.printf("avg : %.1f\n", avg);

        scanner.close();
    }
}
