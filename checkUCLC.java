import java.util.Scanner;

public class checkUCLC {
    public static void main(String[] args) {
       System.out.println("enter the character: ");
       Scanner Sc=new Scanner(System.in);
       char ch= Sc.next().charAt(0);
       int ascii =(int) ch;
        
        if (ascii>=65 && ascii<=90 )
        {
             System.out.println("entered character is uppercase");

        }
        else if (ascii>=97 && ascii<=122)
        {
            System.out.println("entered char is lowercase");
        }
        else{
            System.out.println("invalid entry");
        }
    }
    
}
