import java.util.Scanner;

class Time {
    int hour, min, sec;

    Time() {
        this(0, 0, 0);
    }

    Time(int hour) {
        this(hour, 0, 0);
    }

    Time(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    void output() {
        System.out.println("hour : " + hour + ", minute : " + min + ", second : " + sec);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int s2 = sc.nextInt();
        
        Time t1 = new Time();
        Time t2 = new Time(h);
        Time t3 = new Time(m, s, s2);
        
        System.out.print("Midnight -> ");
        t1.output();
        System.out.print("Input time -> ");
        t2.output();
        System.out.print("Promise -> ");
        t3.output();
        
        sc.close();
    }
}
