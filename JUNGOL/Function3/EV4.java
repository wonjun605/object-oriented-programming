import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solve(n));
        sc.close();
    }

    public static int solve(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        
        int a = 1;
        int b = 2;
        int result = 0;
        
        for (int i = 3; i <= n; i++) {
            result = (a * b) % 100;
            a = b;
            b = result;
        }
        
        return result;
    }
}
