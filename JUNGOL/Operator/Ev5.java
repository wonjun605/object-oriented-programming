import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int minsuHeight = sc.nextInt();
        int minsuWeight = sc.nextInt();
        int giyeongHeight = sc.nextInt();
        int giyeongWeight = sc.nextInt();
        
        boolean isMinsuBigger = (minsuHeight > giyeongHeight) && (minsuWeight > giyeongWeight);
        
        System.out.println(isMinsuBigger);
        
        sc.close();
    }
}
