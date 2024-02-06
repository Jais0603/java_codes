import java.util.Scanner;

public class reverseusingfunction {
    public static void main(String[] args) {
       // Scanner scan = new Scanner(System.in);
        reversethedigit(23);
        reversethedigit(342);

    }
    static void reversethedigit(int x){
       
        int r=0,rem;
        while(x>0){
            
            rem= x%10;
            r=r*10+rem;
            x=x/10;
        }
        System.out.println("reverse number is = "+r);
    }
}
