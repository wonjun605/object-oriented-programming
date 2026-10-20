import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        for (int i = 1; i <= 9; i++) {
            if (a >= b) {
                for (int dan = a; dan >= b; dan--) {
                    System.out.printf("%d * %d = %2d   ", dan, i, dan * i);
                }
            } else {
                for (int dan = a; dan <= b; dan++) {
                    System.out.printf("%d * %d = %2d   ", dan, i, dan * i);
                }
            }
            System.out.println();
        }
        
        sc.close();
    }
}
