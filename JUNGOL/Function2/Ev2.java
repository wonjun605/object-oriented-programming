import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        long result = 1;
        for (int i = 0; i < t; i++) {
            result *= 3;
        }
        
        System.out.println(result);
        sc.close();
    }
}
