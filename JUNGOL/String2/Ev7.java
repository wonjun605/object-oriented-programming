import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        
        int n1 = extractNumber(s1);
        int n2 = extractNumber(s2);
        
        System.out.println(n1 * n2);
        sc.close();
    }
    
    public static int extractNumber(String s) {
        String numStr = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                numStr += c;
            } else {
                break;
            }
        }
        return numStr.isEmpty() ? 0 : Integer.parseInt(numStr);
    }
}
