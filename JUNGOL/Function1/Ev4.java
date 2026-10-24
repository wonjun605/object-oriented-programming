import java.util.Scanner;

public class Main {
    public static int getSquareDiff(int a, int b) {
        if (a > b) {
            return (a * a) - (b * b);
        } else {
            return (b * b) - (a * a);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(getSquareDiff(a, b));
        sc.close();
    }
}
