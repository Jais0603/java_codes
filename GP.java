import java.util.Scanner;

public class GP {
    public static void main(String[] args) {
        Scanner sj= new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int a= sj.nextInt();
        System.out.println("Enter the common ratio");
        int r= sj.nextInt();
        System.out.println("Enter the value of finding term");
        int n= sj.nextInt();
        int ans= a*(int)(Math.pow(r, n-1));
        System.out.println("The required number is: " + ans);

    }
}
