import java.util.Scanner;

public class factorailfor {
    public static void main(String[] args) {
        System.out.println("enter the number");
        int u;
        Scanner scan = new Scanner(System.in);
        u = scan.nextInt();
       
        int  fact = 1;
        for(int i=1; i<=u; i++)
        {
            fact=fact*i;
        }
        System.out.println("the factorial of " +  u +" is " + fact);
       
    }
}
