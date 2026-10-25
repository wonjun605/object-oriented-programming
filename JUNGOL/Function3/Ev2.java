import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNums(n);
        sc.close();
    }

    public static void printNums(int n) {
        if (n <= 0) {
            return;
        }
        printNums(n - 2);
        System.out.print(n + " ");
    }
}
