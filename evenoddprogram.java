import java.util.Scanner;

public class evenoddprogram {
    public static void main(String[] args) {
        System.out.println("please eneter a number");
        int n;
        Scanner Sc=new Scanner(System.in);
        n=Sc.nextInt();
        if(n%2==0)
        {
            System.out.println("the given number is even");

        }
        else
        {
            System.out.println("the given number is odd");
        }
    }
    
}
