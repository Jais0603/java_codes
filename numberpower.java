
import java.util.Scanner;

public class numberpower {
    public static void main(String[] args) {
        System.out.println("enter the number & power ");
        int number,power;
        Scanner Sc= new Scanner(System.in);
        number=Sc.nextInt();
        power=Sc.nextInt();
        double result= Math.pow(number,power);
        if (result%2==0)
        {
            System.out.println("the number is even");
        }
        else{
            System.out.println("the number is odd");
        }
    }
}
