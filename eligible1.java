import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;

public class eligible1 {
    public static void main(String[] args) {
        
        int age, marks;
        String name;
        System.out.println("enter the details below");
        Scanner Sc= new Scanner(System.in);
        System.out.println("enter name");
        name=Sc.nextLine();
        System.out.println("enter age");
        age=Sc.nextInt();
        System.out.println("enter marks");
        marks=Sc.nextInt();
        if(age>=17 && age<=21 && marks>=80)
        {
            System.out.println("he/she is eligible for loan");
        }
        else{
            System.out.println("he/she is not eligible");
        }

    }
}
