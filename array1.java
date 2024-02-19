import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int arr[]= new int[6];
        // arr[0]=12;
        // arr[1]=34;
        // arr[2]=78;
        // arr[3]=87;
        // arr[4]=89;

        // for(int x: arr){
        //    System.out.println(arr[0]);
        //     System.out.println(arr[1]);
        //     System.out.println(arr[2]);
        //     System.out.println(arr[3]);
        //     System.out.println(arr[4]);
        // }

        for(int i=0; i<=arr.length-1;i++){
            System.out.print("the "+i+" th element is : ");
            arr[i]=scan.nextInt();
          
        //    System.out.println(arr[i]);
        }
        
        System.out.println("printing the value of array ");
        for(int j=0; j<arr.length; j++){
            System.out.print(arr[j]+" " );
        }
    }
}
