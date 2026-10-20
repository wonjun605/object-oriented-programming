import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int sum = 0;
        
        for (int i = 5; i <= n; i += 5) {
            sum += i;
        }
        
        System.out.println(sum);
        
        sc.close();
    }
}
