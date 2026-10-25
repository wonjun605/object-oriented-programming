import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            String s = sc.next();
            if (s.equals("END")) {
                break;
            }
            StringBuilder sb = new StringBuilder(s);
            System.out.println(sb.reverse().toString());
        }
        
        sc.close();
    }
}
