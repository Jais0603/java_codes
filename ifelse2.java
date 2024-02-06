import java.util.Scanner;

public class ifelse2 {
    public static void main(String[] args) {
        int x;
        System.out.println("please the enter the value");
        Scanner Sc=new Scanner(System.in);
        x=Sc.nextInt();
        if(x>50)
        {
            System.out.println("the entered value is greater than 50");
        }
        else
        {
            System.out.println("the entered value is less than 50");
        }
    }
}
