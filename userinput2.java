import java.util.Scanner;

public class userinput2 {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner scan= new Scanner(System.in);
        int n;
        n= scan.nextInt();
        System.out.println("the output is: ");
        for(int i=1; i<=n; i++)
        {
            if (i==16)
            {
                break;
            }
            System.out.println(i);
        }
    }
}

