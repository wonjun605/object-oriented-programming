import java.util.Scanner;

public class Main {
    static int n, m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[] arr = new int[n];
        dfs(0, 0, arr);
        sc.close();
    }

    public static void dfs(int depth, int sum, int[] arr) {
        if (depth == n) {
            if (sum == m) {
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i] + (i == n - 1 ? "" : " "));
                }
                System.out.println();
            }
            return;
        }

        for (int i = 1; i <= 6; i++) {
            arr[depth] = i;
            dfs(depth + 1, sum + i, arr);
        }
    }
}
