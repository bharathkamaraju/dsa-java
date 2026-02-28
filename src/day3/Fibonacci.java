package day3;
import java.util.Scanner;
public class Fibonacci
{
    void fib(int n){
        int a=0,b=1,c;
        System.out.println("Fibonacci series");
        for(int i=0;i<=n;i++){
            System.out.println(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter one number");
    int n=sc.nextInt();
    Fibonacci ob=new Fibonacci();
    ob.fib(n);
    }
}
