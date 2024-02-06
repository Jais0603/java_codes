import java.util.Scanner;

public class swapping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Before Swap");
        int x= scan.nextInt();
        int y=scan.nextInt();
        System.out.println(x);
        System.out.println(y);
        int temp =x;
        x=y;
        y=temp;
        System.out.println("After Swap");
        System.out.println(x);
        System.out.println(y);


    }
}
