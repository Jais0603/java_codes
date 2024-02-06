// maximum and minimum of an araray using sorting

import java.util.Arrays;
import java.util.Scanner;


public class MinMaxarray {

    static int [] smallestAndlargesstElement(int arr[]){
        Arrays.sort(arr);
        int [] ans = {arr[0], arr[arr.length-1]};
            // for(int i=0; i<arr.length; i++){  for sorting 
            //    System.out.println(arr[i]); 
            // }

            return ans;
    }
     public static void main(String[] args) {
        Scanner sj=  new Scanner(System.in);
        System.out.println("Enter the size of aarray: ");

        int n= sj.nextInt();
        int [] arr= new int[n];

        System.out.println("Enter the arrays :");

        for(int i = 0; i<arr.length; i++){
            arr[i] = sj.nextInt();

        }
        //System.out.println("The sorted arrays are: ");

         int[] ans = smallestAndlargesstElement(arr);

        System.out.println("The largest element is: " + ans[0]);
        System.out.println("The smallest element is: " + ans[1]);
    }
}
