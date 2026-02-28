public class swap {
    public static void main(String[]args){
        int a=10,b=20;
        System.out.println("before swapping"+a+" "+b);

        //using temp
        /*int temp;
        temp=a;
        a=b;
        b=temp;*/

        //using arithmetic operator
        /*a=a+b;
        b=a-b;
        a=a-b;*/

        //using bitwise operator
        /*a=a^b;
        b=a^b;
        a=a^b;*/

        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("after swapping"+a+" "+b);

    }

}
