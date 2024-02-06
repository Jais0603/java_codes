  // interface can be extended 


interface one{
    int sum(int a, int b);
    int minus(int a, int b);

}

interface two extends one{
    int multiply(int a, int b);
}

class TestInter implements one, two{

    public int sum(int a, int b){
        return a+b;
    }
    public int minus(int a, int b){
        return a-b;
    }
    public int multiply(int a, int b){
        return a*b;
    }
}

public class extendedinterface {

    public static void main(String[] args) {
        TestInter ti1 = new TestInter();
        System.out.println(ti1.sum(45,63));
        System.out.println(ti1.minus(456,63));
        System.out.println(ti1.multiply(45,63));


        one o1 = new TestInter();
            System.out.println(o1.sum(30,10));
            System.out.println(o1.minus(30,12));
        // System.out.println(o1.multiply(30,10));          //this line will give error because multiply is not defined in interface one
    
    
        two t2 = new TestInter();

        //two t2 =o1;            this line will give error of type mismatch
       // two t2 = ti1;
        //two t2 =(two)o1;
           System.out.println(t2.sum(30,10));        //     this line will give error because sum and minus is not defined in interface two
            System.out.println(t2.minus(30,12));
        System.out.println(t2.multiply(30,10));

        

    
    }
    
}
