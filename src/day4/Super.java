package day4;
class Apple{
    String brand="apple";
    Apple(){
        System.out.println("Apple Constructor called");
    }
    void showBrand(){
        System.out.println("Brand:"+brand);
    }
}
class iphone extends Apple{
    String Brand="iphone 17";
    iphone(){
        super();//calling parents constructor
        System.out.println("iphone constructor called");
    }
    void display(){
        System.out.println("Model:"+Brand);
        System.out.println("company "+super.brand);//calling parents variables
        super.showBrand();//calling parents methods
    }
}
public class Super {
    public static void main(String[] args) {
        iphone obj=new iphone();
        obj.display();

    }
}
