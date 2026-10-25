import java.util.Scanner;

class Student {
    private String name;
    private int score;

    public void set(String name, int score) {
        this.name = name;
        if (score < 0) {
            this.score = 0;
        } else if (score > 100) {
            this.score = 100;
        } else {
            this.score = score;
        }
    }

    public void addScore(int add) {
        if (add >= 0) {
            this.score += add;
            if (this.score > 100) {
                this.score = 100;
            }
        }
    }

    public void output() {
        System.out.println(name + "'s score is " + score);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String name = sc.next();
        int score = sc.nextInt();
        int addScore = sc.nextInt();
        
        Student student = new Student();
        student.set(name, score);
        student.addScore(addScore);
        student.output();
        
        sc.close();
    }
}
