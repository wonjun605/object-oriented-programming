import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());
        
        while (sb.length() > 1) {
            int pos = sc.nextInt();
            int index = (pos >= sb.length()) ? sb.length() - 1 : pos - 1;
            sb.deleteCharAt(index);
            System.out.println(sb.toString());
        }
        
        sc.close();
    }
}
