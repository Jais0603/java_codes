import java.util.Scanner;

public class sumof2no {
    public static void main(String[] args) {
        Scanner sj= new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int a= sj.nextInt();
        System.out.println("Enter the 2nd number");
        int b= sj.nextInt();
        int sum= a+b;
        System.out.println("The sum of a and b is:" + sum);
    }
}
