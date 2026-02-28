package day2;

import java.util.Scanner;
public class vowelconsonant
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        switch(ch){
            /*case 'a': case 'e': case'i': case 'o': case'u':
            case 'A': case 'E': case 'I': case 'O': case 'U':
                System.out.println("vowel");
                break;
            default:
                System.out.println("consonant");*/
            case 'a','e','i','o','u','A','E','I','O','U' -> System.out.println("vowels");
            default -> System.out.println("consonant");
        }

    }
}
