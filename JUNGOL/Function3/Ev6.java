import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        long product = (long) a * b * c;
        System.out.println(multiplyDigits(product));
        sc.close();
    }

    public static long multiplyDigits(long n) {
        if (n == 0) {
            return 1;
        }
        
        long digit = n % 10;
        if (n / 10 == 0) {
            return digit == 0 ? 1 : digit;
        }
        
        long next = multiplyDigits(n / 10);
        if (digit == 0) {
            return next;
        }
        return digit * next;
    }
}
