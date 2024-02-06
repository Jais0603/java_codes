
    import java.io.*;
import java.util.*;

public class solutions {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        System.out.println("choose the conversion type  \n 1.FORENHITE to CELCIUS \n 2.CELCIUS to FORENHITE ");
        int n= scan.nextInt();
        double f= scan.nextDouble();
         double c= scan.nextDouble();
        int ch=scan.nextInt();
        switch(ch){
            case 1: System.out.println("Enter  Fahrenheit temperature");
                    
              c=(f-32)*5/9;
                System.out.println("Celsius temperature is = "+c);
          break;
        case 2:  System.out.println("Enter  Celsius temperature");
                         
              f=((9*c)/5)+32;
              System.out.println("Fahrenheit temperature is = "+f);
          break;
                default:  System.out.println("please choose valid choice");
        }


        
    }
}

