import java.util.Scanner;

public class switchcalculator {
    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);
        char operator;
        
        System.out.println("select the opertors +,-, * and /");
        operator = scan.next().charAt(0);

        Double num1,num2,result;

        System.out.println("Enter the 1st number");
        num1 = scan.nextDouble();
        System.out.println("Enter the 2nd number");
        num2 = scan.nextDouble();

        switch(operator){
            case '+':
            result=num1+num2;
            System.out.println("Sum of the given two numbers:" +(num1+num2));
            break;
            case '-':
            result=num1-num2;
            System.out.println("Difference of the given two numbers:"+ (num1-num2));
            break;
            case '*':
            result=num1*num2;
            System.out.println("Multiplication of the given two numbers:" +(num1*num2));
            break;
            case '/':
            result=num1/num2;
            System.out.println("division of the given numbers:"+ (num1/num2));
            break;
            default:
            System.out.println("Invalid operator");

        }

    }
}