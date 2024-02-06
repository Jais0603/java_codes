// given 2 integers a and b. swap the 2 integers values using sum and differance method.


public class SumDiff {

    static void swap(int a, int b){
        System.out.println("Original values before swapping: ");
        System.out.println("a : " + a);
        System.out.println("b : " + b);

        a= a+b;
        b= a-b;
        a= a-b;


        System.out.println("Changed values after swapping: ");
        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }
    public static void main(String[] args) {

        int a= 12;
        int b= 18;
        swap(a, b);
        
    }
    
}
