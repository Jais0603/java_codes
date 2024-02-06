// checking wheather given array is sorted or not!



import java.util.Scanner;

import javax.swing.plaf.synth.SynthPasswordFieldUI;

public class sortarray {

    static boolean isSorted(int[] arr){
        boolean check= true;
        for(int i=1; i<arr.length; i++){
            if(arr[i] < arr[i-1]){   // not sorted 
                check = false;
                break;
            } 

        }
        return check;
    }
    public static void main(String[] args) {
        Scanner sj = new Scanner(System.in);
        System.out.println("Enter the size of array :  ");
        int n= sj.nextInt();

        int [] arr = new int[n];

        System.out.println("Enter the elements of aaray : ");

        for(int i=0; i<arr.length; i++){
            arr[i] = sj.nextInt();

        }

        System.out.println("The given array is sorted: "+ isSorted(arr));
        
    }
}
