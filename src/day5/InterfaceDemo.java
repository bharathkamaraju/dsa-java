package day5;
interface Animal{
    void sound();//abstract method(no body)
    default void bite(){
        //default is having method body
        System.out.println("Animals Bites");
    }
}
class cat implements Animal{
    @Override
    public void sound() {
        System.out.println("meow");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        cat c=new cat();
        c.sound();
        c.bite();
    }
}

