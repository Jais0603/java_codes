import java.util.Scanner;

public class lastdigit {
    public static void main(String[] args) {
        Scanner sj= new Scanner(System.in);
        System.out.println("Enter the digit");
        int n = sj.nextInt();
        int y= Math.abs(n);
        int ans=y%10;
        System.out.println("The last number of the givendidgit is:" + ans);
    }
}
