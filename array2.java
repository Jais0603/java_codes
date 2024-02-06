import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthPasswordFieldUI;

public class array2 {

    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }

       System.out.println();
    }
    public static void main(String[] args) {
        Scanner sj= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n= sj.nextInt();
        int [] arr = new int [n];

        System.out.println("Enter " + n +" " +  " Elements");
        for(int i=0; i<arr.length; i++){
            arr[i] =sj.nextInt();
            
        }
       
            System.out.println("Original Array");
            printArray(arr);
            
             
// trying to copy arr to arr_2;
            
            
                // int [] arr_2 = arr;
                //int [] arr_2 = arr.clone();
                int arr_2[] =Arrays.copyOf(arr, arr.length);
                //int arr_2= Arrays.copyOfRange(arr, 0, arr.length, null)
                System.out.println("Copied  Array");
                printArray(arr_2);


// changing some value of arr_2;

                arr_2[0] = 78;
                arr_2[3] = 89;

                System.out.println("Original array after changing the value of arr");
                printArray(arr);
               
                System.out.println("Copied arrya after changing the value of arr_2");
          
                printArray(arr_2);

    }
}
 