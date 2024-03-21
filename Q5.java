import java.util.Scanner;

class Person{
    String name;
    int age;
  
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

}
class Employee extends Person{
    int Eid;
    double salary;
    Employee(String name, int age, int Eid, double salary){
         super(name, age);
         this.Eid = Eid;
         this.salary = salary;

    }
    void empdisplay(){
        System.out.println("The name of the employee is:"+ name);
        System.out.println("The employee id is"+ Eid);
        System.out.println("The age of the Employee is:"+ age);
        System.out.println("The salary of the employee is:"+ salary);
        
    }
    
    
}





public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the employee:");
        String name = sc.nextLine();
        System.out.println("Enter age of the employee:");
        int age = sc.nextInt();
        System.out.println("Enter salary of the employee:");
        double salary = sc.nextDouble();
        System.out.println("Enter employee id of the employee:");
        int Eid = sc.nextInt();

        Employee e1 = new Employee(name, age, Eid, salary);
        e1.empdisplay();
        
    }
    
}
