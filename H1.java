import java.util.*;
class Commission{
    int sales;
    double Commision;
    Commission(int sales){
        if(sales  < 100){
            this.Commision = 0.2 * sales;

        }
        else if(sales >=500 && sales <5000){
            this.Commision = 0.5 * sales;
        }
        else{
            this.Commision = 0.8 * sales;
        }




  
    }
    void getCommission(){
        System.out.println(Commision);

    }

}

public class H1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sales:");
        int commission = sc.nextInt();
        Commission c1 = new Commission(commission);
        c1.getCommission();



    }
}

//here the issue is in question it is not stated that what will be the value of sales from 100 to below 500