package day4;


class parent{
    void display(){
        System.out.println("parent class");
    }
}
class child extends parent{
    void display1(){
        System.out.println("child class");
    }
}
public class singlelevel{
    public static void main(String[] args) {
        child c = new child();//child  can call both parent and child but parent can acces only itself
        c.display1();
        c.display();
}
}
