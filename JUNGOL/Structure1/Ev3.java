import java.util.Scanner;

class Rect {
    int x1, y1, x2, y2;

    public Rect(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int r1x1 = sc.nextInt();
        int r1y1 = sc.nextInt();
        int r1x2 = sc.nextInt();
        int r1y2 = sc.nextInt();
        
        int r2x1 = sc.nextInt();
        int r2y1 = sc.nextInt();
        int r2x2 = sc.nextInt();
        int r2y2 = sc.nextInt();
        
        Rect r1 = new Rect(r1x1, r1y1, r1x2, r1y2);
        Rect r2 = new Rect(r2x1, r2y1, r2x2, r2y2);
        
        int minX1 = Math.min(r1.x1, r2.x1);
        int minY1 = Math.min(r1.y1, r2.y1);
        int maxX2 = Math.max(r1.x2, r2.x2);
        int maxY2 = Math.max(r1.y2, r2.y2);
        
        System.out.println(minX1 + " " + minY1 + " " + maxX2 + " " + maxY2);
        
        sc.close();
    }
}
