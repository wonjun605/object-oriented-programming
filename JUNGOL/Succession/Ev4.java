import java.util.Scanner;

class Figure {
}

class Circle extends Figure {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void output() {
        double area = radius * radius * 3.14;
        System.out.println("Circle's area : " + area);
    }
}

class Triangle extends Figure {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    void output() {
        double area = base * height / 2.0;
        System.out.println("Triangle's area : " + area);
    }
}

class Rectangle extends Figure {
    double width, length;

    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    void output() {
        double area = width * length;
        System.out.println("Rectangle area : " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        double w = sc.nextDouble();
        double l = sc.nextDouble();

        Circle c = new Circle(r);
        Triangle t = new Triangle(b, h);
        Rectangle rect = new Rectangle(w, l);

        c.output();
        t.output();
        rect.output();

        sc.close();
    }
}
