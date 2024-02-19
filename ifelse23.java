import java.util.Scanner;

public class ifelse23 {
    public static void main(String[] args) {
        
        Scanner sj = new Scanner(System.in);
        int a= sj.nextInt();
        int c= sj.nextInt();

        if (a==c)
        {
            System.out.println(" A and C are equal");

        }
        if(a>c){
            System.out.println("A is greater than C");
        }

        if(a<c){
            System.out.println("A is less than C");
        }
    }
}
