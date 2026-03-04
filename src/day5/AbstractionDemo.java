package day5;
abstract class shape{
    abstract void draw();//Abstract method without a method body
    void area(){//Non abstract method
        System.out.println("Area of a shape");
    }
}
class Circle extends shape{//to initialize abstract method
    @Override
    void draw(){
            System.out.println("Drawing a circle");

    }
}
public class AbstractionDemo {
    public static void main(String[] args) {
        shape s=new Circle();//object of derived class with respect to abstract class
        s.draw();
        s.area();

    }
}
