import java.util.Arrays;
import java.util.Scanner;

class Student implements Comparable<Student> {
    String name;
    int s1, s2, s3, total;

    public Student(String name, int s1, int s2, int s3) {
        this.name = name;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.total = s1 + s2 + s3;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(other.total, this.total);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int s1 = sc.nextInt();
            int s2 = sc.nextInt();
            int s3 = sc.nextInt();
            students[i] = new Student(name, s1, s2, s3);
        }
        
        Arrays.sort(students);
        
        for (Student st : students) {
            System.out.println(st.name + " " + st.s1 + " " + st.s2 + " " + st.s3 + " " + st.total);
        }
        
        sc.close();
    }
}
