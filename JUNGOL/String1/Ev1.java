import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c1 = sc.next().charAt(0);
        char c2 = sc.next().charAt(0);
        
        int sum = c1 + c2;
        int diff = Math.abs(c1 - c2);
        
        System.out.println(sum + " " + diff);
        sc.close();
    }
}
