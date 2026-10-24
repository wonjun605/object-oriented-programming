import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] c = new int[7];
        
        for (int i = 0; i < 10; i++) {
            c[sc.nextInt()]++;
        }
        
        for (int i = 1; i <= 6; i++) {
            System.out.println(i + " : " + c[i]);
        }
        
        sc.close();
    }
}
