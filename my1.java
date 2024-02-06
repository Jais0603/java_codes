class A{
    void test()
    {
      System.out.println("Inside A");
    }
  }
  
  class B extends A{
    void test()
    {
      System.out.println("Inside B");
    }
  } 
  class C extends B{
    void test(){
      System.out.println("Inside C");
    }
  }
  
  
  
  public class my1 {
      

  
    public static void main(String[] args) {
      A a1=new A(); a1.test();
      A b1=new B(); b1.test();
      C c1=new C(); c1.test();
      A a2;
      a2 = a1; a2.test();
      a2 = b1; a2.test();
      a2 = c1; a2.test();
  
      
    }
}
  

