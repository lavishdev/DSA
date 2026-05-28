package Pattern_Printing_Problem;

import java.util.Scanner;

public class Solid_Square_Pattern {
    public static void main(String[] args) {


        int n = 4;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
