import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        
        while (true) {
            String s = sc.next();
            if (s.equals("0")) {
                break;
            }
            words.add(s);
        }
        
        System.out.println(words.size());
        for (int i = 0; i < words.size(); i += 2) {
            System.out.println(words.get(i));
        }
        
        sc.close();
    }
}
