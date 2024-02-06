/*Sameer wants to develop a program for ATM. Help him by constructing the program for the same.
In the program if user withdraws amount upto 1000 then machine will dispence Rs. 100 notes only.
Minimum number of notes should be dispenced by the machine. Notes of denomination of 100,200,500 and 2000 are available in machine.
Input Format

One integer value between 100-20000.

Constraints

Maximum withdrawl amount should be 20000, Minimum should be 100 and amount should be in the multiple of 100 only.

Output Format

Print the number of notes dispenced and their denomination.

Sample Input 0

1100
Sample Output 0

1 100 Notes
2 500 Notes
Sample Input 1

1550
Sample Output 1

Invalid Input

*/


 
import java.io.*; 
import java.util.*; 
 
public class atm { 
 
    public static void main(String[] args) { 
        Scanner ss=new Scanner(System.in); 
        int x=ss.nextInt(); 
        if(x<100||x>20000||x%100!=0) 
            System.out.println("Invalid Input"); 
        else{ 
            if(x<=1000){ 
                int y=x/100; 
                System.out.println(""+y+" "+100+" Notes"); 
            } 
            else{ 
                int x2k=0; 
                int x500=0; 
                int x200=0; 
                int x100=0; 
                if(x!=0){ 
                    x2k=x/2000; 
                    x=x%2000; 
                } 
                if(x!=0){ 
                    x500=x/500; 
                    x=x%500; 
                } 
                if(x!=0){ 
                    x200=x/200; 
                    x=x%200; 
                } 
                if(x!=0){ 
                    x100=x/100; 
     
                } 
                if(x100!=0) 
                    System.out.println(""+x100+" "+100+" Notes"); 
                if(x200!=0) 
                    System.out.println(""+x200+" "+200+" Notes"); 
                if(x500!=0) 
                    System.out.println(""+x500+" "+500+" Notes"); 
                if(x2k!=0) 
                    System.out.println(""+x2k+" "+2000+" Notes"); 
            } 
        } 
         
    }
}