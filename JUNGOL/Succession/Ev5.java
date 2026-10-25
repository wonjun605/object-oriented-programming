import java.util.Scanner;

class Body {
    int height;
    double weight;

    public Body(int height, double weight) {
        this.height = height;
        this.weight = weight;
    }
}

class Student {
    String name;
    Body body;

    public Student(String name, int height, double weight) {
        this.name = name;
        this.body = new Body(height, weight);
    }

    public void output() {
        System.out.println(name + "'s body : " + body.height + "cm, " + body.weight + "kg");
    }

    public boolean equalsBody(Student other) {
        return this.body.height == other.body.height && this.body.weight == other.body.weight;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name1 = sc.next();
        int h1 = sc.nextInt();
        double w1 = sc.nextDouble();

        String name2 = sc.next();
        int h2 = sc.nextInt();
        double w2 = sc.nextDouble();

        Student s1 = new Student(name1, h1, w1);
        Student s2 = new Student(name2, h2, w2);

        System.out.println("Body.Student");
        s1.output();

        if (s1.equalsBody(s2)) {
            System.out.println(s1.name + "'s body == " + s2.name + "'s body");
        } else {
            System.out.println(s1.name + "'s body != " + s2.name + "'s body");
        }

        sc.close();
    }
}
