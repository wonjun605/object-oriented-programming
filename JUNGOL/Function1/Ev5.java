import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[][] scores = new int[4][4];

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            scores[i][j] = sc.nextInt();
            scores[i][3] += scores[i][j];
            scores[3][j] += scores[i][j];
            scores[3][3] += scores[i][j];
        }
    }

    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            System.out.print(scores[i][j] + (j == 3 ? "" : " "));
        }
        System.out.println();
    }

    sc.close();
}


}
