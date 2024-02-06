import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        //System.out.println("enter the numbers");
        Scanner scan= new Scanner(System.in);

        int a =scan.nextInt();
        int b= scan.nextInt();
        
        for (int i= a>b?a:b; i<=a*b; i=i+ a>b?a:b)
        {
        if (i%a==0 && i%b==0)
    
        {
            System.out.println(i);
            break;
        }
    }
}
}
