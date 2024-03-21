class Complex{
    int real;
    int imag;
    void setData(int real, int imag ){
        this.real = real;
        this.imag = imag;
    }
    void display(){
        System.out.println("The real no is:"+ real);
        System.out.println("The imaginary no is:"+ imag);

    }
    public Complex(int real, int imag){
        this.real = real;  
        this.imag = imag;
    }
    @Override
    public String toString() {
        return real + " + " + imag + "i";
    }
    public static Complex  add(Complex c1, Complex c2){
        Complex c3 = new Complex(0, 0);
        c3.real = c1.real + c2.real;
        c3.imag = c1.imag + c2.imag;
        return c3;
        

        


    }

}
public class Q2 {
    public static void main(String args[]){
        Complex c1 = new Complex(2, 3);
        Complex c2 = new Complex(3, 5);
        c1.display();
        c2.display();
        Complex sum = Complex.add(c1, c2);
        System.out.println(sum);
        
        
        
        
        

    }
    
}
