package day1;
import java.util.Scanner;
public class user_input
{
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        /*System.out.println("print a number:");
        int b=sc.nextInt();
        System.out.println(b);


        System.out.println("enter a paragraph:");
        String a=sc.nextLine();
        System.out.println(a);*/

        System.out.println("enter a character");
        char ch=sc.next().charAt(0);
        System.out.println(ch);
    }

}
