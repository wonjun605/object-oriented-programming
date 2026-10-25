import java.util.Scanner;

class Student {
    String name;
    int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
}

class Score extends Student {
    int english;
    int mathematics;

    public Score(String name, int grade, int english, int mathematics) {
        super(name, grade);
        this.english = english;
        this.mathematics = mathematics;
    }

    public void output() {
        System.out.println("== Score ==");
        System.out.println("name : " + name);
        System.out.println("grade : " + grade);
        System.out.println("english : " + english);
        System.out.println("mathematics : " + mathematics);
    }
}

class Physical extends Student {
    int height;
    double weight;

    public Physical(String name, int grade, int height, double weight) {
        super(name, grade);
        this.height = height;
        this.weight = weight;
    }

    public void output() {
        System.out.println("\n== Physical ==");
        System.out.println("name : " + name);
        System.out.println("grade : " + grade);
        System.out.println("height : " + height);
        System.out.println("weight : " + weight);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String name1 = sc.next();
        int grade1 = sc.nextInt();
        int english = sc.nextInt();
        int mathematics = sc.nextInt();
        
        String name2 = sc.next();
        int grade2 = sc.nextInt();
        int height = sc.nextInt();
        double weight = sc.nextDouble();
        
        Score score = new Score(name1, grade1, english, mathematics);
        Physical physical = new Physical(name2, grade2, height, weight);
        
        score.output();
        physical.output();
        
        sc.close();
    }
}
