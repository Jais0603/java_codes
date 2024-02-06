import java.util.Scanner;

public class userinput1 {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner scan = new Scanner(System.in);
        int num;
        num= scan.nextInt();
        System.out.println("output is : ");
        for(int i=1;i<=num;i++)
        {
            if (i==16)
            {
                break;
            }
            System.out.println(i);
        }
        
    }
}
