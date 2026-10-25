import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int current = n;
        java.util.List<Integer> list = new java.util.ArrayList<>();
        
        while (current > 0) {
            list.add(0, current);
            current /= 2;
        }
        
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + (i == list.size() - 1 ? "" : " "));
        }
        
        sc.close();
    }
}
