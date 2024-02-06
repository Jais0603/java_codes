import java.util.Scanner;

public class userinputinloop {
    public static void main(String[] args) {
       // System.out.println("enter the number");
       Scanner scan= new Scanner(System.in);
        int n;
      while(true)
      {
        System.out.println("enter the number");
            n=scan.nextInt();
            if (n== -1)
            {
                break;
            }
        }
        System.out.println("loop break");
    }
}
