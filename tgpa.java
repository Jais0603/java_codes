import java.util.Scanner;

public class tgpa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the marks obtained in subject 1:");
        int m1=scan.nextInt();
        System.out.println("enter the marks obtained in subject 2:");
        int m2=scan.nextInt();
        System.out.println("enter the marks obtained in subject 3:");
        int m3=scan.nextInt();
        int tgpa = (m1+m2+m3)/(3*10);
        System.out.println("the tgpa is:" + "  " +tgpa);
    }
}
