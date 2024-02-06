import java.util.Scanner;

public class switchi {
    public static void main(String[] args) {
       /* * Scanner scan= new Scanner(System.in);
        System.out.println("enter the number");
        int a= scan.nextInt();
        */
        for(int i= 0; i<6; i++){
            switch(i){
                case 0:
                System.out.println("i is zero");
                break;
                case 1:
                System.out.println("i is one");
                break;
                case 2:
                System.out.println("i is two");
                break;
                default:
                System.out.println("i is greater than 6");
            }
        }
    }
}
