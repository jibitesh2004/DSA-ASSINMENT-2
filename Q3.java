
class Product{
	long prodId;
	double price;
	long quantity;
	static double totalprice;
	Product(long prodId, double price, long quantity){
		this.prodId = prodId;
		this.price = price;
		this.quantity = quantity;
		
		
	}
	void display() {
		System.out.println("prodId:" + prodId);
		System.out.println("price:"+price);
		System.out.println("quantity:"+quantity);
		//System.out.println(totalprice);
		
	}
	
	
}



public class Q3 {
	public static void main(String args[]) {
		Product p1 = new Product(423323, 2323.5, 3243);
		System.out.println("Details of first product are:");
		p1.display();
		System.out.println();
		Product p2 = new Product(34343, 3434.5, 3344);
		System.out.println("Details of second product are:");
		p2.display();
		System.out.println();
		Product p3 = new Product(34242, 243.3, 32432);
		System.out.println("Details of first third are:");
		p3.display();
		System.out.println();
		Product p4 = new Product(34334, 343.4, 4344);
		System.out.println("Details of fourth product are:");
		p4.display();
		System.out.println();
		Product p5 = new Product(3434, 343.43, 4324);
		System.out.println("Details of fifth product are:");
		p5.display();
		System.out.println();
		System.out.println("Total amount the person will pay for the purchase of 5 products:-");
		System.out.println( Product.totalprice = p1.price + p2.price + p2.price + p3.price + p4.price + p5.price);
		
		
	}

}
