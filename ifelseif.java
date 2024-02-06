import java.util.Scanner;

public class ifelseif {
    public static void main(String[] args) {
        System.out.println("please enter the marks");
        int marks;
        Scanner Sc= new Scanner(System.in);
        marks=Sc.nextInt();
        if (marks>90 && marks<=100){
            System.out.println("Grade A");
        }
        else if(marks>80 && marks<=90 )
        {
            System.out.println("Grade B");

        }
        else if(marks>70 && marks<=80 )
        {
            System.out.println("Grade C");

        }
        else if(marks<70 )
        {
            System.out.println("Grade D");

        }

    }
}
