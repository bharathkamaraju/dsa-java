package day4;

public class Avengers{
        String Name;//Instance Variable 2 usages
        // Constructor
        Avengers (String Name) { //Local variable 1usage
            this.Name=Name; //this keyword
        }
        Avengers() { //Default constructor 1 usage
            System.out.println("Default Constructor Called");
        }
        void display(){
            System.out.println("Tony Stark: "+Name);
        }
        public static void main(String[] args){
            Avengers a1=new Avengers ( "Iron Man");
            Avengers a2=new Avengers();
            a1.display();
        }
}
