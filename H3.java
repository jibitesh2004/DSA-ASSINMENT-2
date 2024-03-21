import java.util.*;

class Bank {
    String BName;
    double depositAamount;

    void setBankName(String BName) {
        this.BName = BName;
    }

    void setAmount(double depositAamount) {
        this.depositAamount = depositAamount;
    }

    void showData() {
        System.out.println(BName);
        System.out.println(depositAamount);
    }
}

public class H3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Note: The minimum Deposit Amount is 1000");
        Bank b[] = new Bank[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the bank name:");
            String BName = sc.nextLine();
            System.out.println("Enter the deposit money:");
            while (true) {
                double depositAamount = sc.nextDouble();
                if (depositAamount > 1000) {
                    b[i] = new Bank();
                    b[i].setAmount(depositAamount);
                    sc.nextLine();
                    b[i].setBankName(BName);
                    break; // Added break statement to exit the loop once valid input is received
                } else {
                    System.out.println("Note: The minimum Deposit Amount is 1000");
                }
            }
        }

        double totalAmount = 0;
        double min = Integer.MAX_VALUE;
        for (int j = 0; j < 5; j++) {
            b[j].showData();
            totalAmount += b[j].depositAamount;
            if (min > b[j].depositAamount) {
                min = b[j].depositAamount;
            }
        }

        System.out.println("Total Amount: " + totalAmount);

        for (int k = 0; k < 5; k++) {
            if (min == b[k].depositAamount) {
                System.out.println("Bank with Minimum Deposit Amount: " + b[k].BName);
            }
        }
    }
}