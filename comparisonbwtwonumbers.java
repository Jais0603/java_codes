import java.util.Scanner;

public class comparisonbwtwonumbers {
    public static void main(String[] args) {
        System.out.println("please enter the two values");
        int a,b;
        Scanner Sc= new Scanner(System.in);
        a=Sc.nextInt();
        b=Sc.nextInt();
        if(a>b)
        {
            System.out.println(a+" is greater than "+b);
        }
        else{
            System.out.println(a+" is less than"+b);
        }

    }
    
}
