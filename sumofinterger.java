import java.util.Scanner;

public class sumofinterger {
    public static void main(String[] args) {
        int i, oddsum=0,evensum=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the numbers");
        i= scan.nextInt();
        for(int n=1; n<=i; i++)
        {
            if (n%2==0)
            {
                evensum=evensum+n;
            }
            else 
            {
                oddsum = oddsum +n;
            }
        }
        System.out.println("The sum of even number is "+ i + "="+ evensum);
        System.out.println("the sum of odd number is  " + i + "="+ oddsum);
    
    }
}