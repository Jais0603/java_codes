import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner scan = new Scanner(System.in);
        int i;
        i= scan.nextInt();
        if(i%2==0)
        {
            System.out.println("the number is even");
        }
        else 
        {
            System.out.println("the number is odd");
        }
    }
}
