import java.util.*;

class PointType{
    double x;
    double y;
    void setPoint(double x, double y){
        this.x = x;
        this.y = y;
    }
    void showPoint(){
        if(x> 0 && y > 0){
            System.out.println("The circle centre is in 1st quadrant");

        }
        else if(x == 0 && y == 0){
            System.out.println("The circle centre is in origin");
        }
        else if(x <0 && y >0){
            System.out.println("The circle centre is in 2nd quadrant");
        }
        else if(x < 0 && y < 0 ){
            System.out.println("The circle centre is in 3rd quadrant");
        }
        else{
            System.out.println("The circle centre is in 4th quadrant");
        }

    }
    void returnxy(){
        System.out.println("The absicaa  is:"+x);
        System.out.println("The ordinate is: "+y);
    }

}
class CircleType extends PointType{
    double radius;
    double x;
    double y;
    
    CircleType(double x , double y, double radius){
        super.setPoint(x,y );
        this.radius = radius;
        
    }
    void printRadius(){
        System.out.println( "The radius of the circle is:" + radius);
        super.returnxy();
    }
    void areaAndcircum(){
        double area = Math.PI * Math.pow(radius,2);
        System.out.println("The area of the circle is:" + area);
        double circumference = 2 * Math.PI *radius;
        System.out.println("The circumference of the circle is: " + circumference);
    }
}
public class H5 { 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x cordinate for the centre:");
        double x = sc.nextInt();
        System.out.println("Enter the y cordinate for the centre:");
        double y = sc.nextInt();
        CircleType c1 = new CircleType(x,y);
        System.out.println("Enter the radius of the circle:");
        double radius= sc.nextDouble();
        c1.setRadius(radius);
        c1.printRadius();
        c1.areaAndcircum();
    }
}
