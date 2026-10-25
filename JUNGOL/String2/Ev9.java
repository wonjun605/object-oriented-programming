import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String iVal = sc.next();
        double dVal = sc.nextDouble();
        String sVal = sc.next();
        
        String formattedD = String.format("%.3f", dVal);
        while (formattedD.endsWith("0") && formattedD.contains(".")) {
            formattedD = formattedD.substring(0, formattedD.length() - 1);
        }
        if (formattedD.endsWith(".")) {
            formattedD = formattedD.substring(0, formattedD.length() - 1);
        }
        
        String combined = iVal + formattedD + sVal;
        int len = combined.length();
        int mid = (len + 1) / 2;
        
        System.out.println(combined.substring(0, mid));
        System.out.println(combined.substring(mid));
        
        sc.close();
    }
}
