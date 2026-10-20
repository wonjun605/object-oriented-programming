import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for (int i = 1; ; i++) {
            int val = n * i;
            if (val >= 100) {
                break;
            }
            System.out.print(val + " ");
            if (val % 10 == 0) {
                break;
            }
        }
        
        sc.close();
    }
}
