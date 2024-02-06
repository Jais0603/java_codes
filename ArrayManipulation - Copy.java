// find the unique number in agiven array where all the elements are being repeted twice with one value being unique

import java.util.Scanner;


public class ArrayManipulation {

    static int UniqueArray(int[] arr){
        int n= arr.length;
        int ans =-1;
        for(int i=0; i<n; i++){
            for(int j=1; j<n; j++){
                if(arr[i] == arr[j]){
                    arr[i] =-1;
                    arr[j] =-1;
                }
            }
        }
      
        for(int i=0; i<n; i++){
            if(arr[i]>0){
                ans=arr[i];
            }
        }

        return ans;
    }
    

    public static void main(String[] args) {

        Scanner sj= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int a = sj.nextInt();

        int [] arr= new int[a];

        System.out.println("Enter" + " " + a + "elements");

        for(int i=0; i<a; i++){
            arr[i] = sj.nextInt();
        }
    
        System.out.println("Unique element: " + UniqueArray(arr));
        
    }
}
