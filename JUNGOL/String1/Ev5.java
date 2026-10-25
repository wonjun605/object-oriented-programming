import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        
        int len1 = s1.length();
        int len2 = s2.length();
        
        System.out.println(Math.max(len1, len2));
        sc.close();
    }
}
