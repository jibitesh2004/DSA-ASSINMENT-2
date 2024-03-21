
class Distance{
    double meters;
    double centimetres;
    Distance(double meters, double centimetres){
        this.meters = meters;
        this.centimetres = centimetres;
    }
    void display(){
        System.out.print(meters + " ");
        System.out.println(centimetres);
    }
    void sum(Distance d1, Distance d2){
        double totalmetres = d1.meters + d2.meters;
        double totalcentimetre = d1.centimetres + d2.centimetres;
        if(totalcentimetre > 100){
            totalcentimetre/=100;
        }
        System.out.print(totalmetres+ " ");
        System.out.println(totalcentimetre);

    }
}


public class H4 {
    public static void main(String args[]){
        Distance d1 = new Distance(20, 90);
        Distance d2 = new Distance(50, 90);
        System.out.println("The value of the first distance valurs are:");
        d1.display();
        System.out.println("The value of the second distance valurs are:");
        d2.display();
        System.out.println("The value of the Sum of the  distance values are:");
        d1.sum(d1, d2);
        
        




    }
}
