import java.util.Scanner;

// print 10 even numbers using functions

public class function {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        System.out.println("print");
        int a =scan.nextInt();
        printvalue(4);
        printvalue(6);
        printvalue(7);

       }
       static void printvalue(int x){
       for(int i=1; i<=x; i++){
         System.out.println(i*2);
       }
    }
}
