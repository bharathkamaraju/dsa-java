package day6;

public class ThrowInBlock {
    public static void main(String[] args) {
        try{
            System.out.println("Inside try block");
            throw new ArithmeticException("Exception from try");
        }
        catch(ArithmeticException e){
            System.out.println("Exception Caught"+e.getMessage());
            throw new NullPointerException("EXception from catch");
        }
        finally{
            System.out.println("Inside finally block");
            throw new IllegalStateException("Exception from finally");
        }
    }
}
