interface if1{
    int ABC=10;     // by default public static final
    public static final double PI =3.14;
    int sum(int a, int b);
    int  minus(int a, int b);
    default int other(){
    System.out.println("default implementation");
    return -1;
    }
    static void methInt(){
        System.out.println("static method in interface implementation");

    }

}

class TestIf1 implements if1{

        int TestMethodClass(){
        System.out.println("Testing Method");
      

    }
    public int  sum(int a, int b){
        return a+b;

    }
    public int minus(int a, int b){
        return a-b;
    }
    public int other(){
        System.out.println(" new defination for default implementation");
        return 0;
    }

}
public class interface1 {
    public static void main(String[] args) {
        TestIf1 tf1 = new TestIf1();
        //if1 tf1= new TestIf1();
        System.out.println(tf1.sum(15,18)); 
        System.out.println(tf1.minus(87,65));
        System.out.println(tf1.other());
        if1.methInt();
        tf1.TestMethodClass();
	}
    }
   
    
  
