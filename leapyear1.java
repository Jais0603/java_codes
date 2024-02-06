import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class leapyear1 {
    public static void main(String[] args) {
        System.out.println("enter the year");
        int x;
        Scanner scan = new Scanner(System.in);
        x= scan.nextInt();
        if ((x%4==0 && x%100!=0) || (x%400 ==0))
        {
            System.out.println("Leap year");
        }
        else 
    {
        System.out.println("not a leap year");
    }
}
}
