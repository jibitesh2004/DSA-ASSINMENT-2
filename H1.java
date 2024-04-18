import java.util.*;

class Commission {
    int sales;
    double Commision;

    Commission(int sales) {
        if (sales < 100) {
            Commision = 0.02 * sales;
        } else if (sales == 500 && sales < 5000) {
            Commision = 0.05 * sales;
        } else {
            Commision = 0.08 * sales;
        }
    }

    void getCommission() {
        System.out.println(Commision);
    }
}

public class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sales:");
        int sales;
        boolean flag = true;
        while (flag) {
            sales = sc.nextInt();
            if (sales < 0) {
                System.out.println("Invalid Input");
            } else {
                Commission c1 = new Commission(sales);
                c1.getCommission();
                flag = false;
            }
        }
    }
}

// here the issue is in question it is not stated that what will be the value of
// sales from 100 to below 500
