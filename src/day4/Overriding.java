package day4;
class Vehicle{
    void run(){
        System.out.println("Vehicle is Running");
    }
}
class Bus extends Vehicle{
    @Override
    void run() {
        System.out.println("Bus is running smoothly");
    }
}
public class Overriding {
    public static void main(String[] args) {
        Vehicle b=new Bus();
        b.run();

        Vehicle v=new Vehicle();
        v.run();

        Bus b1=new Bus();
        b1.run();

    }

}
