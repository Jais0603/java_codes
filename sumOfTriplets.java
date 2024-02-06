// count the number of triplets whose sum is equal to the given value of x;


import java.util.Scanner;

public class sumOfTriplets {

    
    static int tripletSum(int[] arr, int target){
        int ans =0;
        int n= arr.length;
        for(int i=0; i<n; i++){
            for(int j= 0; j<n;j++){
                for(int k=0; k<n; k++){
                    if(arr[i] +arr[j] + arr[k] == target){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sj= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sj.nextInt();

        int [] arr= new int[n];
        System.out.println("Enter" + " " + n + "elements");

        for(int i=0; i<n; i++){
            arr[i] = sj.nextInt();
        }

        System.out.println("Enter the target Sum");
        int target= sj.nextInt();

        System.out.println(tripletSum(arr, target));

        
    }
}
