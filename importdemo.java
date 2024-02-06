import java.util.Scanner;

public class importdemo {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter a string");
        String s = scan.nextLine();
        System.out.println("enter a string");
        String w = scan.next();
        scan.nextLine();
        System.out.println("enter a val of int");
        int i = scan.nextInt();
        System.out.println("enter val float");
        float f= scan.nextFloat();
        System.out.println("enter a val of double");
        Double d= scan.nextDouble();
        System.out.println("enter a val of long");
        long l= scan.nextLong();
        System.out.println("enter the string");
        char  c=scan.next().charAt(2);
        
    }
}
