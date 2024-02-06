abstract class Test{
    abstract void print();
}
class Test1 extends Test{
    public void print(){
        System.out.println("print method 1");
    }
}

public class abstracts {
    public static void main(String[] args) {
        
    
    Test t1 = new Test1();
    t1.print();

    Test t2 = new Test(){
        public void print(){

            System.out.println("print method 2");
        
        }
    };
    t2.print();
    new Test(){
        public void print(){
            System.out.println("Print method 3");
        }
    }
    .print();

} 
}
