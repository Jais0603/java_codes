import java.util.Scanner;

//import javax.swing.plaf.synth.SynthOptionPaneUI;

public class exam {
  void show(String name, int reg) {

        System.out.println("name of student is  " + name   +"    and Registration num is  " + reg);
  }
  public static void main(String[] args) {
    
  
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your name");
        String name= scan.nextLine();
        System.out.println("enter your registration num");
        int reg= scan.nextInt();
        new exam().show(name, reg);

    }

}
