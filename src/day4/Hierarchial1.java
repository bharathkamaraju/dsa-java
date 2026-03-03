package day4;
class person{
    String name;
    person(String name){
        this.name=name;
    }
    void walk(){
        System.out.println(name+" is walking");
    }
}
class student extends person{
    student(String name) {
        super(name);
    }
    void study(){
        System.out.println(name+" is studying");
    }
}
class professor extends person{
   professor(String name) {
       super(name);
   }
    void teach(){
        System.out.println(name+" is teaching");
    }

}


public class Hierarchial1 {
    public static void main(String[] args) {
        student s=new student("Nikhil");
        s.walk();
        s.study();

        professor p=new professor("GC");
        p.teach();
        p.walk();
    }


}
/*Create a Person class with variable: name and method walk().
Create Student class extending Person with method study().
Create Professor class extending Person with method teach().
Use 'this.name = name' inside constructor.
Create objects of Student and Professor and call inherited and own methods.*/
