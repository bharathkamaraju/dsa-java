package day3;

public class sum
{  //blueprint or template
    int Add(int a,int b)
    {
        int add=a+b;
        return add;//function returning sum of numbers
    }
    void display(){
        System.out.println("Hello users");
    }
    public static void main(String[] args) {
        sum ob=new sum();//Allocated the memory
        /*int n=ob.Add(5,6);//function call
        System.out.println(n);*/
        System.out.println(ob.Add(5,6));//function call
        System.out.println(ob.Add(10,6));
        ob.display();//calling void function
    }
}
