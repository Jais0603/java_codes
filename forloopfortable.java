import java.util.Scanner;

public class forloopfortable {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int u;
        System.out.println("ënter the value of u");
        u = scan.nextInt();
        for(int i=0; i<=u; i++){
            //System.out.println(u + "*" + i+ "=" + (u*i)) ;
            System.out.println(i*2 +1);

        }
    }
}
