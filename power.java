import java.util.Scanner;

//Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another.


public class power {
    public static void main(String[] args) {
        System.out.println("enter the numbers");
        Scanner scan = new Scanner(System.in);
        int base;
        int exponent;
        long result =1;
        base= scan.nextInt();
        exponent = scan.nextInt();
        while (exponent !=0)
        {
            result *= base;
            --exponent;

        }
        System.out.println("Answer = " + result);


    }
    
}
