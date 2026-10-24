import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        a[0] = sc.nextInt();
        a[1] = sc.nextInt();
        System.out.print(a[0] + " " + a[1] + " ");
        for (int i = 2; i < 10; i++) {
            a[i] = (a[i - 2] + a[i - 1]) % 10;
            System.out.print(a[i] + (i == 9 ? "" : " "));
        }
        sc.close();
    }
}
