// create an interface shape containing abstract methods 
  // double computerArea();

  // extends the shape to interface Geometric shape
  // add an apporiate methods

interface shape{
    double computeArea(double a, double b);
    
}

interface geometricshape extends shape{
    double computeperimeter(double a, double b);

}

class TestInter implements shape, geometricshape{

    public double computeArea(double a, double b){
        return a*b;
    }
    public double computeperimeter(double a, double b){
        return 2*(a+b);
    }

}



public class newinterface {

    public static void main(String[] args) {
        TestInter ti1= new TestInter();
        System.out.println(ti1.computeArea(12, 30));
        System.out.println(ti1.computeperimeter(12, 30));
    }
    
}
