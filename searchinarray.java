// Display the highest number in array


import java.util.Scanner;

public class searchinarray {
    public static void main(String[] args) {
        int arr[]={12,34,56,78,89,98,87,45,24,19};
        Scanner scan= new Scanner(System.in);
        int a;
        System.out.println("enter the highest number");
        int n= scan.nextInt();
        int max=arr[0];
        for(int i=1; i<=arr.length;i++){
            if(arr[i]>max)
            max= arr[i];

        }
        System.out.println("the largest number in the array is:"+ a);
    }
}
