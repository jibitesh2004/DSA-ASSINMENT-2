import java.util.*;
interface Sports{
    public void setscore(int score1, int score2);
    public void showscore();
    
}



class Student {
    String name;
    int roll;
    void inputDetails(String name, int roll){
        this.name = name;
        this.roll = roll;
        
    }
    void showDetails(){
        System.out.println(name);
        System.out.println(roll);
    }
}
class Test extends Student{
    int mark1;
    int mark2;
    void inputDetails(int mark1 , int mark2){
        super.inputDetails(name, roll);
        this.mark1 = mark1;
        this.mark2 = mark2;
        
    }
    void showDetails(){
        super.showDetails();
        System.out.println(mark1);
        System.out.println(mark2);
    }
}
class Result extends Test implements Sports{
    int score1;
    int score2;
    @Override
    public void setscore(int score1, int score2){
        this.score1 = score1;
        this.score2 = score2;

        
    }
    Result(int score1, int score2, String name, int roll, int mark1, int mark2){
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.name = name;
        this.roll = roll;
        this.score1 = score1;
        this.score2 = score2;
        
    }
    @Override
    public void showscore(){
        int marks = mark1 + mark2;
        System.out.println("Marks:"+marks);
        int score = score1 + score2;
        System.out.println("Score:" +score);


    }
  

}



public class Q8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the student:");
        String name = sc.nextLine();
        System.out.println("Enter the score1:");
        int score1 = sc.nextInt();
        System.out.println("Enter the score2:");
        int score2 = sc.nextInt();
        System.out.println("Enter the mark1:");
        int mark1 = sc.nextInt();
        System.out.println("Enter the mark2:");
        int mark2= sc.nextInt();
        System.out.println("Enter the roll:");
        int roll = sc.nextInt();
       
        
        Result r1 = new Result(score1, score2, name, roll, mark1, mark2);
        System.out.println("Your Grand Total Mark and Score are:");
        r1.showscore();


        
        
        
        
    }
    
    
}
