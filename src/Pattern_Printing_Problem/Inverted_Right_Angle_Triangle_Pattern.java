package Pattern_Printing_Problem;

import java.util.Scanner;

public class Inverted_Right_Angle_Triangle_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i<=n; i++) {
            for (int j = 0; j<=n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
