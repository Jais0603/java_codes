import java.util.Scanner;

import javax.swing.plaf.synth.SynthPasswordFieldUI;

public class whileloop{

    public static void main (String[] args){
    Scanner sj= new Scanner(System.in);
    System.out.println("Enter the number");
    int n= sj.nextInt();
     int sum =0;
//     int num=1;

//     // while loop
//     while (num<=n){
//         System.out.println(sum);
//         sum=sum+num;
//         num=num+1;

   // }


   // for loop

   for (int num=1; num<=n; num++){
    sum= sum+num;
   }
   System.out.println("Sum of numbers upto n is:" + " " + sum);


}
}