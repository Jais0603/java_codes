// Find the second largest element in the given array;

import java.util.Scanner;


public class SecondLargest {

    static int findMax(int [] arr){
        int max= Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
            max= arr[i];
        }
    }
    return max;

    }

    static int findSecondMax(int []arr){
        int max = findMax(arr);


        for(int i=0;i< arr.length; i++) {
            if(arr[i] == max){
                arr[i] = Integer.MIN_VALUE;
            }
        }

        int SecondMax = findMax(arr);

        return SecondMax;

    }
    
    public static void main(String[] args) {

        Scanner sj= new Scanner(System.in);

        System.out.println("ENter the size of array");

        int a = sj.nextInt();
        int [] arr= new int[a];

        System.out.println("Enter  " +  a + " " +"Elements");
        for(int i= 0; i<a; i++){
            arr[i] = sj.nextInt();

        }

        System.out.println("Second largest element is : " + " " + findSecondMax(arr));

    }
}
