package day4;
class Employee{
    private String name;
    private double salary;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setSalary(double salary){
        if(salary>0){
            this.salary=salary;
        }else{
            System.out.println("invalid salary");
        }
    }
    public double getsalary(){
        return salary;
    }
}
public class Encapsulation{
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.setName("peter");
        emp.setSalary(50000.00);
        System.out.println(emp.getName());
        System.out.println(emp.getsalary());

        emp.setSalary(100000);
        System.out.println("updated salary"+emp.getsalary());

        emp.setSalary(-10000);
    }

}
