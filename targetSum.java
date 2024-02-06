// Find the total no of pairs in the array whose sum is equal to the given value x.

import java.util.Scanner;

public class targetSum {


    static int Pairsum(int [] arr, int target){

        int n= arr.length;
        int ans = 0;
        for(int i=0; i<n;i++){
            for(int j=0; j<n; j++){
                if(arr[i] +arr[j] == target){
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sj = new Scanner(System.in);
        System.out.println("Enter the size of array");

        int n= sj.nextInt();

        int [ ] arr= new int[n];

        System.out.println("Enter" +  n + "elements");
        for(int i=0; i<n; i++){
            arr[i] = sj.nextInt();
        }

        System.out.println("Enter target Sum");
        int target = sj.nextInt();

        System.out.println(Pairsum(arr, target));
    }
}
