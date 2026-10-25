import java.util.Scanner;

class Rectangle {
    private static int maxArea = 0;
    private int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void calcArea() {
        int area = width * height;
        System.out.println("area : " + area);
        if (area > maxArea) {
            maxArea = area;
        }
    }

    public static int getMaxArea() {
        return maxArea;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int w = sc.nextInt();
            int h = sc.nextInt();

            if (w == 0 || h == 0) {
                break;
            }

            Rectangle rect = new Rectangle(w, h);
            rect.calcArea();
        }

        System.out.println("Max area : " + Rectangle.getMaxArea());
        sc.close();
    }
}
