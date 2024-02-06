import java.util.Scanner;

public class sumofnatural {
    public static void main(String[] args) {
        Scanner sj= new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n= sj.nextInt();
        int sum= n*(n+1)/2;
        System.out.println("The sum of n natural number is : " + sum);

    }
}
