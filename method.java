//method testing in java
public class method {

//     int m1= 10;
//     double m2= 20.54;
//     public void meth1()
//     {
//     System.out.println("the value of m1 is:"+ " "+ m1);
//     System.out.println("the value of m2 is: "+ " "+ m2);
// }
//     public static void main(String[] args) {
//         method obj1= new method();
//         obj1.meth1();

    
int m1= 10;
    double m2= 20.54;
    public int mthd3(int a, int b,int c){
        return a+b+c;
    }

    public void meth2(int a, int b)
    {
        int c= a+b;
        System.out.println("Sum of numbers is:"+ " "+ c);
    }
    public void mthd1()
    {
        System.out.println("the value of m1 is: "+ " "+ m1);
        System.out.println("the value of m2 is: "+ " "+ m2);

    }
    public static void main(String[] args) {
        method obj1= new method();
        obj1.mthd1(); obj1.meth2(22,15);
        int c= obj1.mthd3(10,30,40);
        System.out.println("the number is :" + c);
    }
}

    

