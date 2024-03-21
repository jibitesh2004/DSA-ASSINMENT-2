
class Deposit{
	long Principal;
	int time;
	double rate;
	double TotalAmt;
	Deposit(){
		this.Principal= 1000;
		this.rate = 10;
		this.time = 60;
	}
	Deposit(long Principal, int time, double rate){
		this.Principal = Principal;
		this.rate = rate;
		this.time = time;
		
	}
    Deposit(long Principal, int time){
    	this.Principal = Principal;
    	this.time = time;
    }
    Deposit(long Principal, double rate){
    	this.Principal = Principal;
    	this.rate = rate;
    }
    void Display() {
    	System.out.println("The principal value is:" + Principal);
    	System.out.println("The Rate value is:" + rate);
    	System.out.println("The Time value is:" + time);
    	
    }
}


public class Q4 {
	public static void main(String args[]) {    
		Deposit d1 = new Deposit(1331,60,23 );
		
		
		d1.Display();
		System.out.println("The Total Amount is:");
		System.out.println(d1.TotalAmt= d1.Principal + (d1.Principal * d1.rate * d1.time)/100);
		
		Deposit d2 = new Deposit();
		d2.Display();
		System.out.println("The Total Amount is:");
		System.out.println(d2.TotalAmt= d2.Principal + (d2.Principal * d2.rate * d2.time)/100);
		
		Deposit d3= new Deposit(54465, 90);
		d3.Display();
		System.out.println("The Total Amount is:");
		System.out.println(d3.TotalAmt= d3.Principal + (d3.Principal * d3.rate * d3.time)/100);
		
		Deposit d4 = new Deposit(54564, 25);
		d4.Display();
		System.out.println("The Total Amount is:");
		System.out.println(d4.TotalAmt= d4.Principal + (d4.Principal * d4.rate * d4.time)/100);


	}
}
			
			
			
		
		
		
		
	

