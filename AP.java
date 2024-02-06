import java.util.Scanner;

public class AP {
    public static void main(String[] args) {
        Scanner sj= new Scanner(System.in);
        System.out.println("Enter the value of 1st number");
        int a= sj.nextInt();
        System.out.println("Enter the common differance");
        int d= sj.nextInt();
        System.out.println("Enter the nth number");
        int n= sj.nextInt();
        int ans = a + (n-1)*d;
        System.out.println("The nth number is " + ans);
    }
}
