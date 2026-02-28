package day1;

public class implicit
{
    static void main(String[] args) {
        int a=10;
        System.out.println(a);
        double d=a;//implicit(widening)
        System.out.println(d);
        int b=(int)d;//explicit(narrowing)
        System.out.println(b);
    }
}
