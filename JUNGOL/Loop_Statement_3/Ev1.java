import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sum = 0;
        int count = 0;
        
        for (int i = 0; i < 20; i++) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            sum += num;
            count++;
        }
        
        int avg = count > 0 ? (sum / count) : 0;
        
        System.out.println(sum + " " + avg);
        
        sc.close();
    }
}
