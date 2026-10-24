
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
char[][] arr = new char[3][5];

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 5; j++) {
            char ch = sc.next().charAt(0);
            arr[i][j] = (char) (ch + 32);
        }
    }

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 5; j++) {
            System.out.print(arr[i][j] + (j == 4 ? "" : " "));
        }
        System.out.println();
    }

    sc.close();
}


}
