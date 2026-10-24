public class Main {
    public static void main(String[] args) {
        int[][] arr = {
            {3, 5, 9},
            {2, 11, 5},
            {8, 30, 10},
            {22, 5, 1}
        };
        
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%2d ", arr[i][j]);
                sum += arr[i][j];
            }
            System.out.println();
        }
        System.out.println(sum);
    }
}
```[cite: 2]
