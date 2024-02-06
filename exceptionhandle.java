public class exceptionhandle {
    // static void subroutine(){

    //     int d=0;
    //     int a=42/d;
    // }
     public static void main(String[] args) {
    //     exceptionhandle.subroutine();
    // }



    try {
       int  d = 0;
       int  a = 42 / d;
        System.out.println("After exception generated");
       String s=args[4];
       System.out.println(s);

        }
        catch (ArrayIndexOutOfBoundException e)
        {
            System.out.println("Array index exception generted");
        }
        
    }
}
