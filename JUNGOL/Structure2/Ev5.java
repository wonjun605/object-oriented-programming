import java.util.Scanner;

class Student {
    static int passedCount = 0;
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
        if (score >= 80) {
            passedCount++;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5];
        
        for (int i = 0; i < 5; i++) {
            String name = sc.next();
            int score = sc.nextInt();
            students[i] = new Student(name, score);
        }
        
        System.out.println("Passed number : " + Student.passedCount);
        for (Student s : students) {
            if (s.score >= 80) {
                System.out.println(s.name);
            }
        }
        
        sc.close();
    }
}
