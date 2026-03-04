package day6;
class MyThread1 extends Thread{
    public void run() {
        try {
            System.out.println("sleeping");
            Thread.sleep(10000);
            System.out.println("Awake");
        } catch (Exception e) {
        }
    }
}
public class Waiting_Blocked {
    public static void main(String[] args) {
        MyThread1 t1=new MyThread1();//1st stage
        t1.start();
    }
}
