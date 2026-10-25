import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char target = sc.next().charAt(0);
        
        int index = s.indexOf(target);
        if (index != -1) {
            System.out.println(index);
        } else {
            System.out.println("No");
        }
        
        sc.close();
    }
}
