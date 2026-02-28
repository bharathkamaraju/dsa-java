package day2;

import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original=n;
        int rev = 0;
        while (n > 0) {
            int d = n % 10;
            rev = rev * 10 + d;
            n = n / 10;
        }
            if (rev==original) {
                System.out.println("number is palidrome");
            } else {
                System.out.println("number is not day2.palindrome");

        }
    }
}
