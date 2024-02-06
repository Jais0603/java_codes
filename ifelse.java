import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        int a;
        System.out.println("please enter the age");
        Scanner Sc= new Scanner(System.in);
        a=Sc.nextInt(); 
        if (a>18)
        {
            System.out.println("you are allowed to drive");
        }
        else{
            System.out.println("you are not allowed to drive");
        }

    }
}
