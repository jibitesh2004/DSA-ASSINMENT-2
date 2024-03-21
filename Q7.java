import java.util.Scanner;

interface DetailInfo{
    void display();
    int count();

}
class Person{
    static int maxcount;
    String name;
    Person(String name){
        this.name = name;
    }
    void display(){
        System.out.println(name);
        System.out.println(name.length());
    }


}



public class Q7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the person:");
        String name = sc.nextLine();
        Person p1 = new Person(name);
        p1.display();



    }
}