import java.util.Scanner;

public class userinputloop1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int u;
        while(true)
        { 
            System.out.println("enter the number");
            u= scan.nextInt();
            if(u== -1)
            {
                break;
            } 
        }
        System.out.println("loop break");
    }
}
