package day7;

public class Missingnumber {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,0,8,9,10};
        int n=arr.length;
        int expected=n*(n+1)/2;//formula to calculate sum of n natural numbers
        int actual=0;
        for(int x:arr){
            actual+=x;
        }
        System.out.println("Missing number:"+(expected-actual)+" Thala");
    }
}
