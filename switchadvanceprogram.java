import java.util.Scanner;

public class switchadvanceprogram {
    public static void main(String[] args) {
        System.out.println("please enter the number");
        int week;
        Scanner Sc= new Scanner(System.in);
        week=Sc.nextInt();
        switch(week)
        {
            case 1->{
                System.out.println("monday");
                System.out.println("Again 9 to 5 classess");
            }
            case 2->{
                System.out.println("tuesday");
                System.out.println("one more day Again 9 to 5 classess");
            }
            case 3->{
                System.out.println("wednesday");
                System.out.println("now its mid weekand of 9 to 5 classess");
            }
            case 4->{
                System.out.println("thursday");
                System.out.println("Hurray its going to to holdiday after tommorow");
            }
            case 5->{
                System.out.println("friday");
                System.out.println("finally its last day of weekand ");
            }
            case 6->{
                System.out.println("saturday");
                System.out.println("hurray its party day");
            }
            case 7->{
                System.out.println("Sunday");
                System.out.println("its shopping day");
            }
            default->{
            System.out.println("Invalid entry");
            }
        }
    }
    
}
