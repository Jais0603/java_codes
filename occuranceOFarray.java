import java.util.Scanner;

import javax.swing.plaf.synth.SynthPasswordFieldUI;

public class occuranceOFarray {

    // write a method which will return the no of occurance of number in array!

    static int countOccurance( int[] arr, int x){
        int count =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] ==x){
                count++;
            }
        }
            return count;
    }


    public static void main(String[] args) {
        
        
        Scanner sj= new Scanner(System.in);
        System.out.println("Enter size of elements");
        int n = sj.nextInt();

        int []  arr= new int[n];
        System.out.println("Enter" + n + " " + "elements : " );
            
            for(int i= 0; i<arr.length; i++){
            arr[i] = sj.nextInt();
        } 
            System.out.println("Enter x");
            int x= sj.nextInt();

            System.out.println("Count of x  : " + countOccurance(arr, x));
        
    }
    
}
