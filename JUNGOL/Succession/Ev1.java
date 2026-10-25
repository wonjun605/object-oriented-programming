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
        System.out.println("name : " + name);
        System.out.println("grade : " + grade);
        System.out.println("english : " + english);
        System.out.println("mathematics : " + mathematics);
        System.out.println("sum : " + (english + mathematics));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String name = sc.next();
        int grade = sc.nextInt();
        int english = sc.nextInt();
        int mathematics = sc.nextInt();
        
        Score score = new Score(name, grade, english, mathematics);
        score.output();
        
        sc.close();
    }
}
