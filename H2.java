import java.util.*;
class Book{
    String BName;
    String BEdition;
    double BPrice;
    Book(String BName, String BEdition, double BPrice){
        this.BName = BName;
        this.BEdition = BEdition;
        this.BPrice = BPrice;

    }
    void display(){
        System.out.println(BName);
        System.out.println(BEdition);
        System.out.println(BPrice);
    }


}


public class H2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
      //if we want to do it without using array do this using this:-
        // Book b1 = new Book("Tom","2nd" , 2050);
        // Book b2 = new Book("TOmmy", "1st", 5008);
        // Book b3 = new Book("atomic", "1st", 5090);
        // Book b4 = new Book("the monk sold his ferrari", "1st", 5030);
        // Book b5 = new Book("word power made easy", "1st", 8800);
        Book b[] = new Book[5];
        for(int i = 0; i<5; i++){
            System.out.println("Enter the book name");
            String BName = sc.nextLine();
            System.out.println("Enter the Book Edition:");
            String BEditon = sc.nextLine();
            System.out.println("Enter the Book Price:");
            double BPrice = sc.nextInt();
            sc.nextLine();
            b[i] = new Book(BName, BEditon, BPrice);
        }
       double max =  Math.max(b[0].BPrice, (Math.max(b[1].BPrice,(Math.max(b[2].BPrice, (Math.max(b[3].BPrice, b[4].BPrice)))))));
       if(max == b[1].BPrice){
        b[0].display();
       }
       else if(max == b[2].BPrice){
        b[1].display();
       }
       else if(max == b[3].BPrice){
        b[2].display();
       }
       else if(max == b[3].BPrice){
        b[3].display();
       }
       else{
        b[4].display();
       }

    }

    
}
