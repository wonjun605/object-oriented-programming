import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char target = sc.next().charAt(0);
        
        String[] words = {"flower", "rose", "lily", "daffodil", "azalea"};
        int count = 0;
        
        for (String word : words) {
            if (word.length() >= 3) {
                if (word.charAt(1) == target || word.charAt(2) == target) {
                    System.out.println(word);
                    count++;
                }
            }
        }
        
        if (count == 0) {
            System.out.println(0);
        } else {
            System.out.println(count);
        }
        
        sc.close();
    }
}
