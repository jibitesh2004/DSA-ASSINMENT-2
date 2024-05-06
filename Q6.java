abstract class Marks{
    double markICP;
    double markDSA;
    double percentage;
    abstract void getpercentage();
    }
class CSE extends Marks{
    int algoDesign;
    CSE(int markICP, int markDSA, int algoDesign){
        this.algoDesign= algoDesign;
        this.markDSA = markDSA;
        this.markICP = markICP;
    }
    void getpercentage(){
        System.out.println(((markICP + markDSA + algoDesign)/300)*100  + "%");
    }
}
class NonCSE extends Marks{
    int enggMechanics;
    NonCSE(int markICP, int markDSA, int enggMechanics){
        this. enggMechanics=  enggMechanics;
        this.markDSA = markDSA;
        this.markICP = markICP;
    }
    void getpercentage(){
        System.out.println(((markICP + markDSA + enggMechanics)/300)*100 + "%");
    }
}
public class Q6 {
    public static void main(String args[]){
        CSE c1 = new CSE(99, 99, 99);
        NonCSE c2 = new NonCSE(100, 100, 100);
        c1.getpercentage();
        c2.getpercentage();
    }
} 
