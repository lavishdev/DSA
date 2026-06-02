package LeetCode;

import java.util.Scanner;

public class Ques_1281 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n =  input.nextInt();
        int product = 1;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            product *= rem;
            sum += rem;
            n /=10;
        }
        System.out.println(product-sum);

    }
}
