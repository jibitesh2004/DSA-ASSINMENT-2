import java.util.*;
class Book{
    String BName;
    String BEdition;
    int BPrice;
    Book(String BName, String BEdition, int BPrice){
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


public class Q1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
     
        
        Book b[] = new Book[5];
        for(int i = 0; i<b.length; i++){
            System.out.print("Enter the book name- ");
            String BName = sc.nextLine();
            System.out.print("Enter the Book Edition- ");
            String BEditon = sc.nextLine();
            System.out.print("Enter the Book Price- ");
            int BPrice = sc.nextInt();
            System.out.println("---------------------------------------------------");
            sc.nextLine();
            b[i] = new Book(BName, BEditon, BPrice);

        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<b.length; i++){
            if(max < b[i].BPrice){
                max = b[i].BPrice;
            }
            int l = max;
            System.out.println("The details of the book with maximum price is: ");
            if(l == b[i].BPrice){
                System.out.println("Book name- " + b[i].BName);
                System.out.println("Book Edition- " + b[i].BEdition);
                System.out.println("Book Price- " + b[i].BPrice);
                break;
            }
        }
        
        

    }
}
