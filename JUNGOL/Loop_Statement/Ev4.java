import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sum = 0;
        int count = 0;
        
        while (true) {
            int score = sc.nextInt();
            if (score < 0 || score > 100) {
                break;
            }
            sum += score;
            count++;
        }
        
        double avg = (double) sum / count;
        
        System.out.println("sum : " + sum);
        System.out.printf("avg : %.1f\n", avg);
        
        sc.close();
    }
}
