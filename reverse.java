// reverse an array consisiting of integer values


public class reverse {

    static void printArray(int []arr)
    {
         for(int i=0; i<=arr.length; i++)
         {
        System.out.println(arr[i] + " " );
    }
    System.out.println();
    }
 

    // without usin temp 
    // static int [] reve rsingArray(int[] arr){
    //     int n = arr.length;
    //     int [] ans= new int[n];
    //     int j =0;

    //     // transverse original arary in reverse direction

    //     for(int i =n-1; i>=0; i-- ){
    //         ans[j++] = arr[i]; 
    //     }

    //     return ans;

    // }


    static void swapInArray(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j] =temp;


    }

        static void reverseArray(int [] arr){
            int i=0;
            int j= arr.length-1;

            while(i<j){
                swapInArray(arr, i, j);
                i++;
                j--;

            }
        }
    
    public static void main(String[] args) {
        int a= 89;
        int b= 34;
        int [] arr={12,13, 14, 15, 16};
    //int [] ans = reversingArray(arr);
    //printArray(ans);
    reverseArray(arr);
    printArray(arr);
      
    }
}
