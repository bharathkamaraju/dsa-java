package day4;
class car
{
    void display(){
        System.out.println("Any car company ");
    }
}
class tata extends car{
    void display1(){
        System.out.println("tata sons");
    }
}
class curvv extends tata{
    void display2(){
        System.out.println("tata curvv");
    }
}
public class multilevel {
    public static void main(String[] args) {
        curvv c=new curvv();
        c.display();
        c.display1();
        c.display2();
    }
}
