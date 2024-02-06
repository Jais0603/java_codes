//public static void main(String[] args) {
    // String str="null";
    // if(str==null){
        //     System.out.println("null");
        // }
        // else(str.length()==0){
            //     System.out.println("zero");
            // }
            
            // String obj ="hai";
            // String obj1="fine";
            // String obj2="hai";
            // System.out.println(obj.equals(obj1) + " "+obj.equals(obj2));
            
    //       class Thiskeyword{  
    //         private int a=4;
    //         private int b=1;
            
    //         void getSum(int a, int b){
    //             this.a=a;
    //             this.b=b;
    //             System.out.println(this.a + this.b);
    //         }
    //     }
    //         public class week6 {
    //             public static void main(String[] args) {
    //                 Thiskeyword T= new Thiskeyword();
    //                 T.getSum(2,2);
    //             }
    // }

    // public class week6{
    //     public static void main(String[] args) {
    //         StringBuffer a= new StringBuffer("Hello India");
    //         StringBuffer b= new StringBuffer("Hello World");
    //         StringBuffer c= new StringBuffer("Hello Java");
           
    //         System.out.print(a.delete(0,6));

    //         System.out.print(b.delete(0,b.length()));

    //         System.out.print(c.delete(0,2));
    //     }
    // }
final class complex{
    private final double re;
    private final double im;
    public complex(double re, double im){
        this.re=re;
        this.im=im;
    }
    public String toString(){
        return "("+ re + "+ "+ im +" i)";
    }
}

    public class week6{
        public static void main(String[] args) {
            complex c= new complex(25,25);
            System.out.println("complex number is" + c);
        }
    }
   
    

