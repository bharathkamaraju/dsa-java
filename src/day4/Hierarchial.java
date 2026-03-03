package day4;
class Human{
    void eat(){
        System.out.println("Human eats pani puri");
    }
}
class Shaktiman extends Human{
    void saveworld(){
        System.out.println("Saving the world");
    }
}
class Gangadhar extends Human{
    void earn(){
        System.out.println("gangadhar works as reporter ");
    }
}
public class Hierarchial {
    public static void main(String[] args) {
        Shaktiman s=new Shaktiman();
        s.eat();
        s.saveworld();

        Gangadhar g=new Gangadhar();
        g.eat();
        g.earn();


    }
}
