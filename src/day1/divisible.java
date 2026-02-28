package day1;
import java.util.Scanner;
public class divisible
{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        int x=sc.nextInt();
        if(x%5==0 && x%3==0){
            System.out.println(x+"is divisible by 5 and 3");
        }else{
            System.out.println(x+"is not divisible by 5 and 3");
        }
    }
}
