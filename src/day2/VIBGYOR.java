package day2;

import java.util.Scanner;
public class VIBGYOR
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        String color;
        switch(ch){
            case 'V':
                color="violet";
                break;
            case 'I':
                color="indigo";
                break;
            case 'B':
                color="blue";
                break;
            case 'G':
                color="green";
                break;

            case 'Y':
                color="yellow";
                break;

            case 'O':
                color="orange";
                break;

            case 'R':
                color="red";
                break;
            default:
                color="invalid";





        }
        System.out.println("color="+color);

    }
}
