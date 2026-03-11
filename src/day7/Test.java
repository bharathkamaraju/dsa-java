package day7;
//case3: Object created inside a method-locally defined
public class Test {
    static void display() {
        Test t1=new Test();
        System.out.println(t1);
    }
    //system.out.println(t1);
    public static void main(String[] args) {
        Test t=new Test();
        System.out.println(t);
        t.display();
        //case4: Anonymous Object-donot have object reference
        new Test();
    }
}
