import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int n = sc.nextInt();
        
        a = a + b;
        
        String copiedB = "";
        for (int i = 0; i < n && i < a.length(); i++) {
            copiedB += a.charAt(i);
        }
        if (n < b.length()) {
            copiedB += b.substring(n);
        }
        b = copiedB;
        
        System.out.println(a);
        System.out.println(b);
        
        sc.close();
    }
}
