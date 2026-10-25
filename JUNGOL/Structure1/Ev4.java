import java.util.Scanner;

class Person {
    int height;
    double weight;

    public Person(int height, double weight) {
        this.height = height;
        this.weight = weight;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int fHeight = sc.nextInt();
        double fWeight = sc.nextDouble();
        int mHeight = sc.nextInt();
        double mWeight = sc.nextDouble();
        
        Person father = new Person(fHeight, fWeight);
        Person mother = new Person(mHeight, mWeight);
        
        double studentHeight = (father.height + mother.height) / 2.0 + 5.0;
        double studentWeight = (father.weight + mother.weight) / 2.0 - 4.5;
        
        int finalHeight = (int) studentHeight;
        
        System.out.println("height : " + finalHeight + "cm");
        System.out.printf("weight : %.1fkg\n", studentWeight);
        
        sc.close();
    }
}
