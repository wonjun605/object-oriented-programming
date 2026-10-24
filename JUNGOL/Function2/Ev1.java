import java.util.Scanner;

public class Main {
    public static void findClosest(int n, int x, int[] arr) {
        int closest = arr[0];
        int minDiff = Math.abs(arr[0] - x);

        for (int i = 1; i < n; i++) {
            int diff = Math.abs(arr[i] - x);
            if (diff < minDiff) {
                minDiff = diff;
                closest = arr[i];
            } else if (diff == minDiff) {
                if (arr[i] < closest) {
                    closest = arr[i];
                }
            }
        }
        System.out.println(closest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        findClosest(n, x, arr);
        sc.close();
    }
}
