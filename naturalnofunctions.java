//Write a function to calculate sum of squares of first N natural numbers.

public class naturalnofunctions {
    public static void main(String[] args) {
        printsum(10);
        printsum(20);
        printsum(30);
        printsum(40);
        printsum(50);
        
    }
    static void printsum(int n){
         n =(n*(n+1))/2;
        System.out.println(n);
        //return c;
    }
}
