package day2;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        char op = sc.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println(x + y);
                break;
            case '-':
                System.out.println(x - y);
                break;
            case '*':
                System.out.println(x * y);
                break;
            case '/':
                System.out.println(x / y);
                break;
            default:
                System.out.println("invalid");
        }
    }
}