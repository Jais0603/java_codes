// rotate the given array a by k steps, where k is non-negative.
// where k can be graeter than n as well.

import java.util.Scanner;

public class rotate {


    static void printArray(int []arr)
    {
         for(int i=0; i<=arr.length; i++)
         {
        System.out.println(arr[i] + " " );
    }
    System.out.println();
    }

    static int[] rotate1(int [] arr, int k){
        int n= arr.length;
        k= k%n;
        int[] ans= new int[n];
        int j =0;

        for(int i=n-k; i<n;i++){
            ans[j++] = arr[i];
        }

        for(int i= 0; i<n-k;i++){
            ans[j++] = arr[i];
        }
        return ans;
    }
    
    public static void main(String[] args) {

        Scanner sj= new Scanner(System.in);
        System.out.println("enter the size of array");
        int n= sj.nextInt();
        int [] arr = new int[n];

        System.out.println("enter" + n + " elements");

        for(int i=0; i<n; i++){
            arr[i] = sj.nextInt();
        }

        System.out.println("enter k: ");
        int k= sj.nextInt();

        System.out.println("Original Array");
        printArray(arr);
        int[] ans = rotate1(arr, k);

        System.out.println("Array after rotation");
        printArray(ans);
        
    }
}
