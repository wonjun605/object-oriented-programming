import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = new String[5];
        
        for (int i = 0; i < 5; i++) {
            words[i] = sc.next();
        }
        
        String target1 = sc.next();
        String target2 = sc.next();
        
        int count = 0;
        for (String word : words) {
            if (word.contains(target1) || word.contains(target2)) {
                System.out.println(word);
                count++;
            }
        }
        
        if (count == 0) {
            System.out.println("none");
        }
        
        sc.close();
    }
}
