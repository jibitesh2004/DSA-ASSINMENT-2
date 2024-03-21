
class Person{
    String name;
    int age;
    void setData(String name, int age){
        this.name = name;
        this.age = age;
    }
    void displayData(){
        System.out.println("The name is:"+ name);
        System.out.println("The age is:" + age);
    }

public class Q1{
    public static void main(String args[]){
       
        Person p1 = new Person();
        p1.name = "Rohan";
        p1.age = 23;
        p1.displayData();
        Person p2 = new Person();
        p2.setData("Jibitesh", 18);
        p2.displayData();
        System.out.println("Rohan is younger");
        

    }


    }
}